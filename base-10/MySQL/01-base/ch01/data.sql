-- 01查看安装数据库服务的编码
select version();

show databases;

use `base-sql`;

show tables;

show variables where variable_name like 'character\_set\_%' or variable_name like 'collation%';

set character_set_server = utf8;

set names utf8;

-- 02创建数据库
create database if not exists aa charset = utf8;

create database if not exists bb charset = utf8mb4;

create database if not exists `base-sql` charset utf8mb4;

show create database aa;

# 03修改属性，但是不能修改数据库名称
alter database aa charset = gbk;

drop database if exists a;

-- 04创建表的两种方式（uuid、自增主键）
CREATE TABLE tb_book
(
    id        varchar(36) NOT NULL,
    book_name varchar(255) DEFAULT NULL,
    book_desc varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE tb_student
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
show create table tb_book;

# 查看表的属性状态：show table status \G;指端格式化
use `base-sql`;
show table status;
desc tb_book;


# 表复制
create table test_copy1 like tb_book;

create table test_copy2 as (select *
                            from tb_book);

# 清空表
truncate tb_book;

# 删除表
drop table if exists t_student,t_book;

# 05、CURL常用操作
insert into tb_book(id, book_name, book_desc)
values (1,'java', '开发');

delete
from tb_book
where id = 1;

update tb_book
set book_desc='java'
where id = 2;

select *
from tb_book
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


select *
from (select goods_name from goods) t