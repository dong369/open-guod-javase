#!/usr/bin/env bash
# 输入区域
echo -n "请输入命令（1|2|3）："
read var

# 函数区域
fun01(){
    echo "函数调用"
}

# 匹配区域
[[ "$var" == "1" ]] && {
        fun01
        exit 0
}

if [[ "$var" == "2" ]]
then
        echo 2
        exit 0
fi

[[ "$var" != "1" && "$var" != "2" ]] && {
        echo error
        exit 1
}