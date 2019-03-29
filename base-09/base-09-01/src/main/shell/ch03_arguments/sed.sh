#!/usr/bin/env bash
# 直接对文本文件进行操作
sed -i '/你好/d' ./test.txt
sed -i '/shell 脚本/a 特定字符串的行后插入新行' ./test.txt
sed -i '/shell 脚本/i 特定字符串的行前插入新行' ./test.txt
sed -i 's/shell/SHELL/g' ./test.txt