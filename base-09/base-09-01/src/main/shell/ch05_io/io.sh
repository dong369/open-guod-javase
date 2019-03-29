#!/usr/bin/env bash
a=12
b=9

echo ${a}
# a-标准正确输出重定向
[[ ${a} + ${b} ]] > ./test_ok.txt

# b-标准错误输出重定向
[[ ${a} < ${b} ]] 2>./test_error.txt

# c-同时保存正确输出和错误输出的结果
[[ ${a} < ${b} ]] > ./test_ok_error01.txt 2>&1
[[ ${a} < ${b} ]] &>./test_ok_error02.txt
[[ ${a} < ${b} ]]>>./test_ok_error03.txt 2>>./test_ok_error04.txt

if [[ ${a} > ${b} ]];then
    exit 1
else
    exit 0
fi

# 输出重定向
#  设备	       设备文件名	    文件描述符	类型
#  键盘	       /dev/stdin	0	        标准输入
#  显示器	   /stdout	    1	        标准输出
#  显示器	   /stderr	    2	        标准错误输出
