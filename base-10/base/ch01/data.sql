# 第一部分：
-- 01查看安装数据库服务的编码
show databases;
use test;
show tables;
show variables where variable_name like 'character\_set\_%' or variable_name like 'collation%';

-- 02创建数据库
create database a charset = utf8;
create database b charset = utf8mb4;

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
  AUTO_INCREMENT = 1000001
  DEFAULT CHARSET = utf8mb4;

-- 04
show tables;