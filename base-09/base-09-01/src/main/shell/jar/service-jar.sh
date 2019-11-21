#!/bin/bash

# Java ENV

# 应用存放地址
APP_HOME=/opt/soft/jar/drug-platform-8088

# 应用名称
APP_NAME=drug-admin.jar

# 应用环境
APP_ENV=prod

# 使用说明，用来提示输入参数
usage() {
    echo "Usage: sh boot [APP_NAME] [start|stop|restart|status]"
    exit 1
}

# 检查程序是否在运行
is_exist(){
    # 获取PID
    PID=$(ps -ef | grep ${APP_NAME} | grep -v $0 | grep -v grep | awk '{print $2}')
    # -z "${pid}"判断pid是否存在，如果不存在返回1，存在返回0
    if [[ -z "${PID}" ]]; then
            # 如果进程不存在返回1
            return 1
    else
            # 进程存在返回0
            return 0
    fi
}

# 定义启动程序函数
start(){
    is_exist
    if [[ $? -eq "0" ]]; then
            echo "${APP_NAME} 正在运行中..., PID=${PID}"
    else
            nohup java -Dloader.path=./lib -jar ${APP_HOME}/${APP_NAME} --spring.profiles.active=${APP_ENV} >/dev/null 2>&1	& PID=$(echo $!)
            echo "${APP_NAME} 启动成功^_^, PID=$!"
    fi
}

# 停止进程函数
stop(){
        is_exist
        if [[ $? -eq "0" ]]; then
                kill -9 ${PID}
                echo "${APP_NAME} 进程已停止, PID=${PID}"
        else    
                echo "${APP_NAME} 已停止!"
        fi
}

# 重启进程函数 
restart(){
        stop
        start
}

# 查看进程状态
status(){
        is_exist
        if [[ $? -eq "0" ]]; then
                echo "${APP_NAME} 正在运行中..., PID=${PID}"
        else    
                echo "${APP_NAME} 已停止运行!"
        fi
}

case $1 in
"start")
        start
        ;;
"stop")
        stop
        ;;
"restart")
        restart
        ;;
"status")
       status
        ;;
	*)
	usage
	;;
esac
exit 0
