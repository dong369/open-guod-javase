#!/usr/bin/env bash
## 文件分发

# 分发机器
machineName=s;
startMachine=21;
endMachine=30;

# 参数校验
pCount=$#;
if((pCount<1)); then
    echo no args
    exit;
fi

# 获取要拷贝的文件/文件夹
p1=$1;
fName=`basename ${p1}`

# 获取前缀目录
pDir=`cd -P $(dirname ${p1}) ; pwd`;

# 获取当前用户
cUser=`whoami`;

# 批量分发
for (( host = startMachine; host <= endMachine; host++ )); do
    echo ----- ${machineName}${host} -----
    rsync -rvl ${pDir}/${fName} ${cUser}@${host}:${pDir}
done