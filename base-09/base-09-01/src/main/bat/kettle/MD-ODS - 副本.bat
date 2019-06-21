rem 跳转到kettle工作目录下
d:
cd D:/kettle_3.2_xgn/distrib
@echo off

rem 输入表的数据库连接参数
set inDB="-param:mysqlMDDB=front_md_cd"
set inIP="-param:mysqlMDIp=localhost"
set inPort="-param:mysqlMDPort=3306"
set inUser="-param:mysqlMDUser=root"
set inPwd="-param:mysqlMDPassword=manager"
set inDatabaseParam=%inDB% %inIP% %inPort% %inUser% %inPwd%

rem 输出表的数据库连接参数
set outDB="-param:odsDB=ODS"
set outIP="-param:odsIp=rm-2ze2ev5wiynqvn90b.mysql.rds.aliyuncs.com"
set outPort="-param:odsPort=3306"
set outUser="-param:odsUser=gfo_dss_dba"
set outPwd="-param:odsPassword=46A979$EEED4"
set outDatabaseParam=%outDB% %outIP% %outPort% %outUser% %outPwd%

set startDate="-param:startDate2=DATE_ADD('2017-01-01',INTERVAL 0 DAY)"
rem set startDate="-param:startDate2=DATE_ADD(curdate(),INTERVAL -1 DAY)"
set endDate="-param:endDate2=DATE_ADD(curdate(),INTERVAL 1 DAY)"
set timeCondition=%startDate% %endDate%

set mydate=%DATE:~0,4%-%DATE:~5,2%-%DATE:~8,2%
rem 填写kettle文件的路径地址
set fileAddress=D:\ECS-Kettle-CD\MD-ODS-pan

rem 填写kettle文件执行完之后日志的存放路径
set logAddress=D:\logs-cd\MD-ODS

rem 设置日志存放路径的变量
set Pan=D:\
set logDir=logs-cd\
set Folder=MD-ODS

if exist %Pan% (
    if exist %Pan%%logDir% (
        echo 目录%Pan%%logDir%已存在，无需创建
    ) else (
        echo 创建%Pan%%logDir%
        md %Pan%%logDir%
    )

    if exist %Pan%%logDir%%Folder% (
        echo 目录%Pan%%logDir%%Folder%已存在无需创建
    ) else (
        echo 创建%Pan%%logDir%%Folder%
        md %Pan%%logDir%%Folder%
    )
) else (
    echo !!
    echo !!创建日志工作文件夹,当前系统上不存在%Pan%盘
    echo !!
)

set /p name=请输入kettle路径（D:\ECS-Kettle-CD\MD-ODS-pan）：

call:read

pause

exit

:read
cd %Pan%
    if exist %Pan% (
        if exist %Pan%%PanDir% (
            cd /d %Pan%%PanDir%
            for %%i in (*kettle*) do call pan.bat /norep  -file=%fileAddress%\%%i -Error=error -log=%logAddress%\%%i_%mydate%.log
            echo 执行成功！！！（按任意键退出）...
        )

    ) else (
        echo !!执行失败，当前系统上不存在%Pan%盘
    )
goto:eof