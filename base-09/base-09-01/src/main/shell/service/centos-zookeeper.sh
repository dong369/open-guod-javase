#!/usr/bin/env bash

#chkconfig:2345 20 90
#description:zookeeper
#processname:zookeeper

case $1 in
          start)
              /usr/local/soft/zookeeper-3.4.13/bin/zkServer.sh start
              ;;
          stop)
              /usr/local/soft/zookeeper-3.4.13/bin/zkServer.sh stop
              ;;
          status)
              /usr/local/soft/zookeeper-3.4.13/bin/zkServer.sh status
              ;;
          restart)
              /usr/local/soft/zookeeper-3.4.13/bin/zkServer.sh restart
              ;;
          *)
              echo "require start|stop|status|restart"
              ;;
esac