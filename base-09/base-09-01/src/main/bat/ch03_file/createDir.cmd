@echo off
chcp 65001
echo ****************************************
echo 自动创建文件夹（存放备份文件和备份脚本）
echo ****************************************

set Pan=D:\
set PanDir=dev01\

call:mdFile2019
call:mdFile2020

echo 已执行完毕（按任意键退出）...

pause

exit

:mdFile2019
cd %Pan%
    if exist %Pan% (
        if exist %Pan%%PanDir% (
            echo 文件夹已经存在！！！
        ) else (
            md %Pan%%PanDir%
            cd /d %Pan%%PanDir%
            for  %%I in (dev2019,dev2020,dev2021) do md %%I
            cd /d %Pan%%PanDir%dev2019
            for  %%I in (01_System,02_Java,03_Soft,04_Service,05_Maven,06_Gradle,07_Code,08_NetWork) do md %%I
            cd 01_System
            for  %%I in (ChatTools) do md %%I
            cd ../02_Java
            for  %%I in (JdkTools,IdeTools,SqlTools,Git,Svn,OtherTools) do md %%I
            cd ../05_Maven
            for  %%I in (MavenWorkspace) do md %%I
            cd ../06_Gradle
            for  %%I in (GradleWorkspace) do md %%I
            cd ../07_Code
            for  %%I in (EclipseWorkspace,StsWorkspace,IdeaWorkspace) do md %%I
            echo 2019文件夹创建成功！！！
        )
    ) else (
        echo !!执行失败，当前系统上不存在%Pan%盘
    )
goto:eof

:mdFile2020
    cd %Pan%
    if exist %Pan% (
        rem 解决windows下cd无法切换盘符目录：01cd /d d: 在 cd 和盘符之间加上 /d；02e: 不用cd指令 直接用 盘符
        cd /d %Pan%%PanDir%dev2020
        for  %%I in (01_System,02_Java,03_Soft,04_Service,05_Maven,06_Gradle,07_Code) do md %%I
        echo 2020文件夹创建成功！！！
    ) else (
        echo !!执行失败，当前系统上不存在%Pan%盘
    )
goto:eof