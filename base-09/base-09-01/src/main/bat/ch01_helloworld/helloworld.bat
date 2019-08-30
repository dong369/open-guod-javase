@echo off
chcp 65001
echo test
echo 中文测试
ping -n 5 127.0.0.1
ping 127.0.0.1 -t
pause