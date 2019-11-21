@echo off
chcp 65001
echo ****************************************
echo 安装SDK依赖包
echo ****************************************

call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-commons-logging  -Dversion=1.2 -Dpackaging=jar -Dfile=etc-commons-logging-1.2.jar

pause