#!/usr/bin/env bash
# 预定义参数（颜色/指令）
RED_COLOR='\E[1;31m'
GREEN_COLOR='\E[1;32m'
YELLOW_COLOR='\E[1;33m'
BLUE_COLOR='\E[1;34m'
RES='\E[0m'
REVEAL=0

# 变量定义区域
VAR_PATH01="/usr/local/"
VAR_PATH02="/usr/local/"
VAR_ARR=(8001 8002 8003 8004 8005 8006)

# 输入指令
echo -n "请输入命令（install|start|stop|status|restart）："
read var

# 函数区域
function Usage(){
    echo -e ${RED_COLOR}'|<===请输入命令（install|start|stop|status|restart）===>|'${RES}
    exit 1
}

# 判断参数的个数
if [[ $# -ne 0 ]];then
    echo $#
    Usage
fi

install(){
    echo -e ${GREEN_COLOR}'|<===安装操作===>|'${RES}
    echo "install"
    return ${REVEAL}
}

start(){
    echo -e ${GREEN_COLOR}'|<===启动操作===>|'${RES}
    for VAR in ${VAR_ARR[@]} ; do
        echo ${VAR}
    done
    return ${REVEAL}
}

stop(){
    echo -e ${GREEN_COLOR}'|<===停止操作===>|'${RES}
    echo "stop"
    return ${REVEAL}
}

status(){
    echo -e ${GREEN_COLOR}'|<===状态操作===>|'${RES}
    echo "status"
    return ${REVEAL}
}

restart(){
    echo -e ${GREEN_COLOR}'|<===重启操作===>|'${RES}
    echo "restart"
    return ${REVEAL}
}

other(){
    echo -e ${RED_COLOR}'|<===输入命令有误（install|start|stop|status|restart）===>|'${RES}
}

# 函数匹配
case ${var} in
"install")
   install;;
"start")
   start;;
"stop")
   stop;;
"status")
   status;;
"restart")
   restart;;
*)
   other;;
esac
exit ${REVEAL}