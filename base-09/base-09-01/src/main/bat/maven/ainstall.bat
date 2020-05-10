@echo off
chcp 65001
echo ****************************************
echo 安装SDK依赖包
echo ****************************************

call mvn install:install-file -DgroupId=com.tianjian -DartifactId=base-commons  -Dversion=1.0 -Dpackaging=jar -Dfile=base-commons-1.0.jar

pause