#!/usr/bin/env bash

# 参数个数判断
pCount=$#
echo ${pCount};
if((pCount<1)); then
    echo no args
    exit
fi

# 文件/文件夹
p1=$1
fName=`basename ${p1}`

# 父路径
pDir=`cd -P $(dirname ${p1}) ; pwd`

# 当前用户处理分发操作
cUser=`whoami`
for (( host=11 ; host<14 ; host=host+1 )) ; do
  echo ------------ s${host} ---------------
  rsync -rvl ${pDir}/${fName} ${cUser}@s${host}:${pDir}
done