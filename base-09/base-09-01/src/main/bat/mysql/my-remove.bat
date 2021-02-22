@echo off
echo 删除MySQL服务

set Pan=D:\
set PanDir=dev\soft\SQL\MySQL\mysql-8.0.21-winx64

cd /d %Pan%%PanDir%/bin
mysqld --remove MySQL-8.0.21

pause
exit