#!/usr/bin/env bash

# awk中变量的使用：不管变量如何定义、赋值，除了加单引号以外，利用awk直接获取变量的输出，结果都是一样的。
# 因此通常会：先用echo加符号输出变量，然后通过管道给awk，进而控制输出结果。
# grep、sed、awk被称为 linux中的"三剑客"。

a="test info"
b="info01:info02:info03"
echo "${a}" | awk '{print $0}'
echo '$ETT' | awk '{print $0}'
# 指定分割条件
echo "${b}" | awk -F ':' '{print $1}'


# 当变量后面连接有其他字符的时候，必须给变量加上大括号{}
dbName=hello
echo ${dbName}_world