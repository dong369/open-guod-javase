#!/usr/bin/env bash
# (()):整数运算的常用运算符
i=0
echo $((i=i+1))

# let:用于整数运算，类似于(())
let i=i+9
echo ${i}

# expr:可用于整数运算，还有其他的额外功能
expr ${i} + 1
expr length 'java'

#$[] :整数运算，$[]进行整数的运算时, $[]===$(())
echo $[${i}+12]

# bc :适合整数，也适合小数
echo 3+3 | bc

# awk:适合整数和小数
echo "3.7 2.11" | awk '{print $1-$2}'
echo "200 890" | awk '{print $0}'
echo "200 890" | awk '{print ($1-$2/$2)}'