#!/usr/bin/env bash
# 初始化centos7系统
# 检查是否为root用户，脚本必须在root权限下运行
# 执行脚本命令：./centOS-init.sh 或 sh centOS-init.sh

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
echo -n "请输入命令（mainAll|systemInfo|yumAliYun|yumUpdate|serviceBase|zoneTime|langConfig|historyConfig|serviceConfig|vimConfig）："
read var

# 01系统配置信息检查
function system_info() {
    if [[ "$(whoami)" != "root" ]]; then
        echo "please run this script as root !" >&2
        exit 1
    fi
    echo -e "\033[31m the script only Support CentOS_7 x86_64 \033[0m"
    echo -e "\033[31m system initialization script, Please Seriously. press ctrl+C to cancel \033[0m"

    # 检查是否为64位系统，这个脚本只支持64位脚本
    platform=`uname -i`
    if [[ ${platform} != "x86_64" ]];then
        echo "this script is only for 64bit Operating System !"
        exit 1
    fi

    if [[ "$1" == "" ]];then
        echo "The host name is empty."
        exit 1
    else
        hostnamectl  --static set-hostname  $1
        hostnamectl  set-hostname  $1
    fi

cat << EOF
+---------------------------------------+
|   your system is CentOS 7 x86_64      |
|           start optimizing            |
+---------------------------------------+
EOF
    sleep 5
}

# 01配置阿里YUM源
yum_aliYun(){
    mv /etc/yum.repos.d/CentOS-Base.repo /etc/yum.repos.d/CentOS-Base.repo.backup
    curl -o /etc/yum.repos.d/CentOS-Base.repo http://mirrors.aliyun.com/repo/Centos-7.repo
    yum makecache
}

# 02安装必要支持工具及软件工具
yum_update(){
    yum update -y
    yum install -y nmap unzip wget vim lsof xz net-tools iptables-services ntpdate ntp-doc psmisc lrzsz libstdc++-devel
    yum install -y gcc make gcc-c++ pcre pcre-devel zlib zlib-devel openssl openssl-devel
}

# 03基础配置（静态IP/hosts/hostname）
function service_base() {
    echo "脚本名$0"
    echo "第一个参数$1"
    echo "第二个参数$2"
}

# 04设置时间同步 set time
zone_time(){
    timedatectl set-timezone Asia/Shanghai
    /usr/sbin/ntpdate 0.cn.pool.ntp.org > /dev/null 2>&1
    /usr/sbin/hwclock --systohc
    /usr/sbin/hwclock -w
cat > /var/spool/cron/root << EOF
10 0 * * * /usr/sbin/ntpdate 0.cn.pool.ntp.org > /dev/null 2>&1
* * * * */1 /usr/sbin/hwclock -w > /dev/null 2>&1
EOF
    chmod 600 /var/spool/cron/root
    /sbin/service crond restart
    sleep 1
}

# 05设置UTF-8   LANG="zh_CN.UTF-8"
lang_config(){
    echo "LANG=\"en_US.UTF-8\"" > /etc/locale.conf
    source  /etc/locale.conf
}


# iptables防护墙规则设置


# SSH配置优化 set sshd_config
ssh_config(){
    if [[ ! -f "/etc/ssh/sshd_config.bak" ]]; then
        cp /etc/ssh/sshd_config /etc/ssh/sshd_config.bak
    fi

cat > /etc/ssh/sshd_config << EOF

EOF
    /sbin/service sshd restart
}

# 设置历史命令记录格式 history
history_config(){
export HISTFILESIZE=10000000
export HISTSIZE=1000000
export PROMPT_COMMAND="history -a"
export HISTTIMEFORMAT="%Y-%m-%d_%H:%M:%S "
cat >> /etc/bashrc << EOF
alias vi='vim'
HISTDIR='/var/log/command.log'
if [ ! -f \$HISTDIR ];then
touch \$HISTDIR
chmod 666 \$HISTDIR
fi
export HISTTIMEFORMAT="{\"TIME\":\"%F %T\",\"IP\":\"\$(ip a | grep -E '192.168|172' | head -1 | awk '{print \$2}' | cut -d/ -f1)\",\"LI\":\"\$(who -u am i 2>/dev/null| awk '{print \$NF}'|sed -e 's/[()]//g')\",\"LU\":\"\$(who am i|awk '{print \$1}')\",\"NU\":\"\${USER}\",\"CMD\":\""
export PROMPT_COMMAND='history 1|tail -1|sed "s/^[ ]\+[0-9]\+  //"|sed "s/$/\"}/">> /var/log/command.log'
EOF
source /etc/bashrc
}

# 服务优化设置
service_config(){
    chmod +x /etc/rc.local
    chmod +x /etc/rc.d/rc.local
}

# vim设置
vim_config(){
cat > /root/.vimrc << EOF
set history=1000
EOF
}

# 结束操作
end_ok(){
cat << EOF
+-------------------------------------------------+
|               optimizer is done                 |
|   it's recommond to restart this server !       |
|             Please Reboot system                |
+-------------------------------------------------+
EOF
}

# 全部执行
main_all(){
    yum_aliyun
    yum_update
    service_base
    zone_time
    lang_config
    history_config
    service_config
    vim_config
    end_ok
}
other(){
    echo -e ${RED_COLOR}'|<===输入命令有误（mainAll|yumAliyun|yumUpdate|serviceBase|zoneTime|langConfig|historyConfig|serviceConfig|vimConfig）===>|'${RES}
}
# 函数匹配
case ${var} in
"mainAll")
   main_all;;
"systemInfo")
   system_info;;
"yumAliYun")
   yum_aliYun;;
"yumUpdate")
   yum_update;;
"serviceBase")
   service_base;;
"zoneTime")
   zone_time;;
"langConfig")
   lang_config;;
"historyConfig")
   history_config;;
"serviceConfig")
   service_config;;
"vimConfig")
   vim_config;;
*)
   other;;
esac
exit ${REVEAL}