#!/usr/bin/env bash
## 命令分发

# 进行参数校验
pCount=$#;
if((pCount<1)); then
    echo no args;
    exit;
fi

# 执行命令
echo ----- localhost -----
$@
for((host=10;host<12;host++)) ; do
    echo ----- ${host} -----
    # 分发执行
    ssh s${host} $@
done