#!/usr/bin/env bash

#/bin/sh （已经被/bin/bash替代）
#
#/bin/bash (默认的shell)
#
#/bin/ksh  (兼容bash)
#
#/bin/tcsh (整合C shell，功能更强大)
#
#/bin/csh  (已经被tcsh取代)
#
#/bin/zsh （源自ksh功能更强大）

# Java ENV
# Linux中文件的拥有者改为指定的用户或组 chown root:root file1.txt
# Linux中执行需要先给脚本添加执行的权限 chmod -R 744 fileName
# Linux用户切换 su root（未关闭shell的切换用户，即环境变量还是原来用户的环境）
#              su - root（关闭了shell的切换，加了-的切换才是真正的切换用户）

echo "hello world shell"

echo "shell脚本你好！"

date