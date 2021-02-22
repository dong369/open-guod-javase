@echo off
echo 初始化MySQL服务

set Pan=D:\
set PanDir=dev\soft\SQL\MySQL\mysql-8.0.21-winx64

rd /s /q %Pan%%PanDir%\data

cd /d %Pan%%PanDir%/bin
mysqld --remove MySQL-8.0.21
mysqld --initialize-insecure --user=mysql
mysqld --install MySQL-8.0.21

pause
exit