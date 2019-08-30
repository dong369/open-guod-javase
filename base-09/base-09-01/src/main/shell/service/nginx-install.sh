#!/bin/bash

#================================================================
#   Copyright (C) 2019  All rights reserved.
#
#   File：：lnmp_install.sh
#   Author：Luoyisheng
#   Date：2019/04/12
#   Description：install nginx,mysql,php
#
#================================================================

dir=/home/data
nginx_download_path="http://nginx.org/download/nginx-1.15.7.tar.gz"
nginx_install_dir="/usr/local/nginx"
nginx_name="nginx-1.15.7.tar.gz"

[ -f /etc/init.d/functions ] && . /etc/init.d/functions || exit 1

# create file download dir
create_dir(){
  if [ ! -e $dir ]
    then
      mkdir $dir
  else
    echo "file download dir is exit!"
  fi
}

# install nginx-1.15.7
install_nginx(){
  # yum install something
  yum install -y wget
  wget -O /etc/yum.repos.d/epel.repo http://mirrors.aliyun.com/repo/epel-6.repo
  yum install -y pcre pcre-devel openssl openssl-devel gcc make gcc-c++
  # download nginx
  [ -e $dir ] && cd $dir
  wget $nginx_download_path
  if [ -f $nginx_name ]
    then
      echo 'nginx download success'
      # tar nginx
      tar zxf $nginx_name && cd nginx-1.15.7
      # add user nginx
      useradd nginx -s /sbin/nologin -M
      # install nginx
      ./configure --user=nginx --group=nginx --prefix=/usr/local/nginx --with-http_stub_status_module --with-http_ssl_module --with-stream --with-stream_ssl_module --with-http_v2_module --with-threads
      [ $(echo $?) -eq 0 ] && make && make install
      [ $(echo $?) -eq 0 ] && echo "nginx install success"
  fi
}
# start nginx
start_nginx(){
 # check syntax
 $nginx_install_dir/sbin/nginx -t
 # start
 if [ $(echo $?) -eq 0 ]
   then
     $nginx_install_dir/sbin/nginx
     if [ $(netstat -lutnp|grep 80|wc -l) -eq 1 ]
       then
         action "nginx starting success..."  /bin/true
     else
         echo "nginx starting fail,plaese check the service!"
     fi
 fi
}

# main function
main(){
   #create dir
   create_dir
   # install
   install_nginx
   sleep 3
   # start
   start_nginx
   sleep 2
}
main