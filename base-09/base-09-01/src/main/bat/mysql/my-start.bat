@echo off
echo 启动MySQL服务...
set Pan=D:\
set PanDir=dev\soft\SQL\MySQL\mysql-8.0.21-winx64

net start MySQL-8.0.21

cd /d %Pan%%PanDir%/bin
mysql -uroot -p

pause
exit