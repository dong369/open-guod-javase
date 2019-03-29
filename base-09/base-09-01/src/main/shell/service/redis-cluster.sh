#!/bin/bash

# 集群文件位置
REDIS_PATH="/usr/local/redis-cluster/"

# 集群信息文件
REDIS_DATA="/redis/data/"

# 集群各种操作
case "$1" in
    start)
    cd ${REDIS_PATH}
    mkdir ${REDIS_DATA}
    # 启动Redis服务
    redis_arr=(8001 8002 8003 8004 8005 8006)
    for num in ${redis_arr[@]}
    do
        echo "start ${num}nth redis server..."
        cd redis${num}/
        ./redis-server ./redis.conf
        cd ..
    done
    # 创建Redis服务集群
    ./redis-cli --cluster create   127.0.0.1:8001 127.0.0.1:8002 127.0.0.1:8003 127.0.0.1:8004 127.0.0.1:8005 127.0.0.1:8006  --cluster-replicas 1
    ;;
    stop)
    echo 'stop redis cluster option.....'
    # 清除数据（细节）
    rm -rf ${REDIS_DATA}appendonly.aof dump.rdb nodes-800*
    rm -rf ${REDIS_PATH}redis*/dump.rdb
    DATA_NUM=`find ${REDIS_PATH} -type f | grep -E "dump.rdb|nodes*" | wc -l`
    if [[ "${DATA_NUM}" -le 0 ]]
        then
            echo -e "=====> Success: Has remove all dump.rdb and nodes configure file."
        else
            echo -e "<===== Fail: There still are files is exist,Use command: \n\tfind ${REDIS_PATH} -type f | grep -E \"dump.rbd|nodes*\" \nto search, and then remove them manually.\n"
        exit 1
    fi
    # 关闭进程
    ps -ef | grep redis | grep cluster | grep -v grep | awk '{print $2}' | xargs kill -9
    echo '进程杀死'
    # 进程数量
    CLUSTER_NUM=`ps aux | grep redis | grep cluster | wc -l`
    if [[ "${CLUSTER_NUM}" -le 0 ]]
        then
            echo -e "=====> Success: Has killed all cluster progress."
        else
            echo -e "<===== Fail: There still are ${CLUSTER_NUM} is alive.\n"
        exit 1
    fi
        ;;
   restart|force-reload)
        ;;
  *)
    echo "Usage: /usr/local/redis-cluster/start.sh {start|stop|restart|reload}" >&2
        exit 1
esac