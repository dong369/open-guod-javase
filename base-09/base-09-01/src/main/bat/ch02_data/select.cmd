@echo off
set a=6
set b=6
if %a%==%b% (echo OK) else (echo NO)
if %a% == 2 (echo 正确) else (if %b% == 8 (echo b值是对的) else (echo b值是错的))
pause>nul