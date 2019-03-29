#!/bin/bash

kconfig:   2345 90 10
# description:  Redis is a persistent key-value database
#
# Simple Redis init.d script conceived to work on Linux systems
# as it does use of the /proc filesystem.
#

# 端口号
REDISPORT=6379

# 执行脚本的地址
EXEC=/usr/local/redis/bin/redis-server

# 客户端执行脚本的地址
REDIS_CLI=/usr/local/redis/bin/redis-cli

# 进程id文件地址
PIDFILE=/var/run/redis_${REDISPORT}.pid

# 配置文件地址
CONF="/usr/local/redis/bin/redis.conf"

case "$1" in
    start)
        if [[ -f ${PIDFILE} ]]
        then
                echo "$PIDFILE exists, process is already running or crashed"
        else
                echo "Starting Redis server..."
                ${EXEC} ${CONF}
        fi
        if [[ "$?"="0" ]]
        then
              echo "Redis is running..."
        fi
        ;;
    stop)
        if [[ ! -f ${PIDFILE} ]]
        then
                echo "$PIDFILE does not exist, process is not running"
        else
                PID=$(cat ${PIDFILE})
                echo "Stopping ..."
                ${REDIS_CLI} -p ${REDISPORT} SHUTDOWN
                while [[ -x ${PIDFILE} ]]
               do
                    echo "Waiting for Redis to shutdown ..."
                    sleep 1
                done
                echo "Redis stopped"
        fi
        ;;
   restart|force-reload)
        ${0} stop
        ${0} start
        ;;
  *)
    echo "Usage: /etc/init.d/service-redis {start|stop|restart|force-reload}" >&2
        exit 1
esac