#!/usr/bin/env bash
# Java ENV 选择结构，注意使用空格

a=1

b=2

c=3

# if-fi查询，a>b
if [[ ${a} -gt ${b} ]]; then
    echo "a>b"
fi

# if-else-fi,a<b
if [[ ${a} -lt ${c} ]];then
    echo "a<c"
else
    echo "a>c"
fi

# if-elif-else-fi
if [[ ${a} -eq ${b} ]];then
    echo "a==b"
elif [[ ${a} -gt ${b} ]];then
    echo "a>b"
else
    echo "a<b"
fi