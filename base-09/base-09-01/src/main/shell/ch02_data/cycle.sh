#!/usr/bin/env bash
# Java ENV 循环结构

# for——shell风格
for var in item1 item2 item3 ; do
    echo ${var}
done

# for——C语言风格
sum=0
for (( i=0;i<=100;i++ ));
do
    sum=$((sum+i))
done
    echo ${sum}

while ((i<=100))
do
    sum=$((sum+i))
    i=$((i+1))
done
    echo ${sum}