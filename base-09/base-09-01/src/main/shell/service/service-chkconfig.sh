#!/usr/bin/env bash
# chkconfig: 345 85 15
# description: Service-chkconfig

# 然后保存
# chkconfig httpd –add  创建系统服
# 现在就可以使用service 来 start or restart
#
# 若仅仅想使用service命令调用，只把脚本放到/etc/init.d/木目录下即可
# chkconfig里面的服务是系统服务，即随着系统开机而开启，关机而关机