@echo off
mysqld --initialize --user=mysql --console
mysqld --install "MySQL8" --defaults-file=".\my.ini"
net start MySQL8
mysql -uroot -p
ALTER USER 'root'@'localhost' IDENTIFIED BY 'passw0rd';
FLUSH PRIVILEGES;
pause