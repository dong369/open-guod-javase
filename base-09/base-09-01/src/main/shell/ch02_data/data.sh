#!/usr/bin/env bash
# Java ENV

# Shell中的变量，变量引用：$ 和 ${}
number01=100
number02=100

# 注意：`` 和 $() 与= 不能有空格
val=`expr ${number01} + ${number02}`
echo "Total value : $val"

# 注意''和""的区别
str="shell info"
strSub='${str} 信息'
strSubInfo="${str} 信息"
echo ${strSub}

# 数组
array=(1 2 3 4 5)
echo ${array[0]}

array_num=(1 2 3 4 5)

for num in ${array_num[@]} ; do
    echo array${num}
done

date