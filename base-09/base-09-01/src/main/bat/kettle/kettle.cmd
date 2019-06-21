@echo off
chcp 65001
echo ****************************************
echo 自动创建文件夹（存放备份文件和备份脚本）
echo ****************************************

set Pan=D:\
set PanDir=dev01\

set /p name=请输入kettle路径（D:\ECS-Kettle-CD\MD-ODS-pan）：

call:read

pause

exit

:read
cd %Pan%
    if exist %Pan% (
        echo %name%
        if exist %Pan%%PanDir% (
            cd /d %Pan%%PanDir%
            for %%i in (*kettle*) do call pan.bat /norep  -file=%fileAddress%\%%i
            echo 已执行完毕（按任意键退出）...
        )
    ) else (
        echo !!执行失败，当前系统上不存在%Pan%盘
    )
goto:eof