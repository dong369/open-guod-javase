-- 01查看安装数据库服务的编码
select version();

show databases;

use test;
show tables;

show variables where variable_name like 'character\_set\_%' or variable_name like 'collation%';

set character_set_server = utf8;

set names utf8;

-- 02创建数据库
create database if not exists a charset = utf8;

create database if not exists b charset = utf8mb4;

show create database a;

# 修改属性，但是不能修改数据库名称
alter database a charset = gbk;
drop database if exists a;

-- 03创建表的两种方式（uuid、自增主键）
CREATE TABLE t_book
(
    id        varchar(36) NOT NULL,
    book_name varchar(255) DEFAULT NULL,
    book_desc varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE t_student
(
    id           bigint(20) NOT NULL AUTO_INCREMENT,
    student_name varchar(255) DEFAULT NULL,
    create_time  datetime     DEFAULT NULL,
    update_time  datetime     DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

-- 04查看所有表及结构
show tables;
show create table a;
# 查看表的属性状态：show table status \G;指端格式化
use test;
show table status;
desc user;
# 表复制
create table test_copy1 like girl;

create table test_copy2 as (select *
                            from girl);
# 清空表
truncate a;

# 删除表
drop table if exists test_copy1,test_copy2;

# 05、CURL常用操作
insert into user(name, age)
values ('java', 44);

delete
from user
where uid = 1;

update user
set name='java'
where uid = 2;

select *
from goods
where 1;


select goods_id, cat_id, goods_name, shop_price
from goods
where goods_name like '诺基亚%';

# 日期时间，同义词
select now(), curdate(), curtime(), current_date(), current_time();

select date_add(curdate(), interval -3 day), date_add(curdate(), interval 0 day);

select database();

select database(), version(), user();


with cte1 as (select * from girl),
     cte2 as (select * from boy)
select *
from cte1,
     cte2
where cte1.hid = cte2.hid;


select * from (select goods_name from goods) t