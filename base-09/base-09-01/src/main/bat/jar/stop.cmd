@echo off
for /f "tokens=5" %%a in ('netstat /ano ^| findstr 8088') do taskkill /F /pid %%a
exit