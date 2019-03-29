#!/usr/bin/env bash
# Java ENV 选择结构，注意使用空格

a=1

b=2

c=3

# if-fi查询
if [[ ${a} < ${b} ]]; then
    echo "a>b"
fi

# if-else-fi
if [[ ${a} > ${c} ]];then
    echo "a>c"
else
    echo "a<c"
fi

# if-elif-else-fi
if [[ ${a} = ${b} ]];then
    echo ""
elif [[ ${a} = ${b} ]];then
e   cho ""
else
    echo ""
fi