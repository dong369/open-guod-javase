@echo off

:start
echo %date:~0,10% %time:~0,8%
choice /t 1 /d y /n >nul

goto start