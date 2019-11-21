@echo off
::文件上传接口调用
start curl -G http://127.0.0.1:8081/batJob/uploadFile
exit