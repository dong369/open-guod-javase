-- 初始化
drop database test;
create database if not exists test charset = utf8mb4;

-- 选择目标库
use `test`;

-- 创建表
create table goods
(
    goods_id     mediumint(8) unsigned primary key auto_increment,
    goods_name   varchar(120)            not null default '',
    cat_id       smallint(5) unsigned    not null default '0',
    brand_id     smallint(5) unsigned    not null default '0',
    goods_sn     char(15)                not null default '',
    goods_number smallint(5) unsigned    not null default '0',
    shop_price   decimal(10, 2) unsigned not null default '0.00',
    market_price decimal(10, 2) unsigned not null default '0.00',
    click_count  int(10) unsigned        not null default '0'
) engine = myisam
  default charset = utf8;

insert into `goods`
values (1, 'kd876', 4, 8, 'ecs000000', 1, 1388.00, 1665.60, 9),
       (4, '诺基亚n85原装充电器', 8, 1, 'ecs000004', 17, 58.00, 69.60, 0),
       (3, '诺基亚原装5800耳机', 8, 1, 'ecs000002', 24, 68.00, 81.60, 3),
       (5, '索爱原装m2卡读卡器', 11, 7, 'ecs000005', 8, 20.00, 24.00, 3),
       (6, '胜创kingmax内存卡', 11, 0, 'ecs000006', 15, 42.00, 50.40, 0),
       (7, '诺基亚n85原装立体声耳机hs-82', 8, 1, 'ecs000007', 20, 100.00, 120.00, 0),
       (8, '飞利浦9@9v', 3, 4, 'ecs000008', 1, 399.00, 478.79, 10),
       (9, '诺基亚e66', 3, 1, 'ecs000009', 4, 2298.00, 2757.60, 20),
       (10, '索爱c702c', 3, 7, 'ecs000010', 7, 1328.00, 1593.60, 11),
       (11, '索爱c702c', 3, 7, 'ecs000011', 1, 1300.00, 0.00, 0),
       (12, '摩托罗拉a810', 3, 2, 'ecs000012', 8, 983.00, 1179.60, 13),
       (13, '诺基亚5320 xpressmusic', 3, 1, 'ecs000013', 8, 1311.00, 1573.20, 13),
       (14, '诺基亚5800xm', 4, 1, 'ecs000014', 1, 2625.00, 3150.00, 6),
       (15, '摩托罗拉a810', 3, 2, 'ecs000015', 3, 788.00, 945.60, 8),
       (16, '恒基伟业g101', 2, 11, 'ecs000016', 0, 823.33, 988.00, 3),
       (17, '夏新n7', 3, 5, 'ecs000017', 1, 2300.00, 2760.00, 2),
       (18, '夏新t5', 4, 5, 'ecs000018', 1, 2878.00, 3453.60, 0),
       (19, '三星sgh-f258', 3, 6, 'ecs000019', 12, 858.00, 1029.60, 7),
       (20, '三星bc01', 3, 6, 'ecs000020', 12, 280.00, 336.00, 14),
       (21, '金立 a30', 3, 10, 'ecs000021', 40, 2000.00, 2400.00, 4),
       (22, '多普达touch hd', 3, 3, 'ecs000022', 1, 5999.00, 7198.80, 16),
       (23, '诺基亚n96', 5, 1, 'ecs000023', 8, 3700.00, 4440.00, 17),
       (24, 'p806', 3, 9, 'ecs000024', 100, 2000.00, 2400.00, 35),
       (25, '小灵通/固话50元充值卡', 13, 0, 'ecs000025', 2, 48.00, 57.59, 0),
       (26, '小灵通/固话20元充值卡', 13, 0, 'ecs000026', 2, 19.00, 22.80, 0),
       (27, '联通100元充值卡', 15, 0, 'ecs000027', 2, 95.00, 100.00, 0),
       (28, '联通50元充值卡', 15, 0, 'ecs000028', 0, 45.00, 50.00, 0),
       (29, '移动100元充值卡', 14, 0, 'ecs000029', 0, 90.00, 0.00, 0),
       (30, '移动20元充值卡', 14, 0, 'ecs000030', 9, 18.00, 21.00, 1),
       (31, '摩托罗拉e8 ', 3, 2, 'ecs000031', 1, 1337.00, 1604.39, 5),
       (32, '诺基亚n85', 3, 1, 'ecs000032', 4, 3010.00, 3612.00, 9);


create table category
(
    cat_id    smallint unsigned auto_increment primary key,
    cat_name  varchar(90) not null default '',
    parent_id smallint unsigned
) engine myisam
  charset utf8;


insert into `category`
values (1, '手机类型', 0),
       (2, 'cdma手机', 1),
       (3, 'gsm手机', 1),
       (4, '3g手机', 1),
       (5, '双模手机', 1),
       (6, '手机配件', 0),
       (7, '充电器', 6),
       (8, '耳机', 6),
       (9, '电池', 6),
       (11, '读卡器和内存卡', 6),
       (12, '充值卡', 0),
       (13, '小灵通/固话充值卡', 12),
       (14, '移动手机充值卡', 12),
       (15, '联通手机充值卡', 12);


create table `result`
(
    `name`    varchar(20) default null,
    `subject` varchar(20) default null,
    `score`   tinyint(4)  default null
) engine = myisam
  default charset = utf8;



insert into result
values ('张三', '数学', 90),
       ('张三', '语文', 50),
       ('张三', '地理', 40),
       ('李四', '语文', 55),
       ('李四', '政治', 45),
       ('王五', '政治', 30);


create table a
(
    id  char(1),
    num int
) engine myisam
  charset utf8;

insert into a
values ('a', 5),
       ('b', 10),
       ('c', 15),
       ('d', 10);

create table b
(
    id  char(1),
    num int
) engine myisam
  charset utf8;

insert into b
values ('b', 5),
       ('c', 15),
       ('d', 20),
       ('e', 99);

create table m
(
    mid    int,
    hid    int,
    gid    int,
    mres   varchar(10),
    matime date
) engine myisam
  charset utf8;

create table t
(
    tid   int,
    tname varchar(20)
) engine myisam
  charset utf8;

insert into m
values (1, 1, 2, '2:0', '2006-05-21'),
       (2, 2, 3, '1:2', '2006-06-21'),
       (3, 3, 1, '2:5', '2006-06-25'),
       (4, 2, 1, '3:2', '2006-07-21');

insert into t
values (1, '国安'),
       (2, '申花'),
       (3, '布尔联队');

create table mian
(
    num int
) engine myisam;
insert into mian
values (3),
       (12),
       (15),
       (25),
       (23),
       (29),
       (34),
       (37),
       (32);

create table user
(
    uid  int primary key auto_increment,
    name varchar(20)       not null default '',
    age  smallint unsigned not null default 0
) engine myisam
  charset utf8;



create table boy
(
    hid   char(1),
    bname varchar(20)
) engine myisam
  charset utf8;


insert into boy (bname, hid)
values ('屌丝', 'a'),
       ('杨过', 'b'),
       ('陈冠希', 'c');


create table girl
(
    hid   char(1),
    gname varchar(20)
) engine myisam
  charset utf8;


insert into girl(gname, hid)
values ('小龙女', 'b'),
       ('张柏芝', 'c'),
       ('死宅女', 'd');

-- 学生信息
create table student
(
    sno   varchar(10) primary key comment '学生主键',
    sname varchar(20) comment '学生姓名',
    sage  int comment '学生年龄',
    ssex  varchar(5) comment '学生性别'
) engine = innodb
  default charset = utf8mb4 comment '学生信息';
insert into student
values ('s001', '张三', 23, '男');
insert into student
values ('s002', '李四', 23, '男');
insert into student
values ('s003', '吴鹏', 25, '男');
insert into student
values ('s004', '琴沁', 20, '女');
insert into student
values ('s005', '王丽', 20, '女');
insert into student
values ('s006', '李波', 21, '男');
insert into student
values ('s007', '刘玉', 21, '男');
insert into student
values ('s008', '萧蓉', 21, '女');
insert into student
values ('s009', '陈萧晓', 23, '女');
insert into student
values ('s010', '陈美', 22, '女');


-- 教师信息
create table teacher
(
    tno   varchar(10) primary key comment '教师编号',
    tname varchar(20) comment '教师名称'
) engine innodb
  default charset = utf8mb4 comment '教师信息';
insert into teacher
values ('t001', '刘阳');
insert into teacher
values ('t002', '谌燕');
insert into teacher
values ('t003', '胡明星');

-- 科目信息
create table course
(
    cno   varchar(10) comment '科目编号',
    cname varchar(20) comment '科目名称',
    tno   varchar(20) comment '教师编号',
    constraint pk_course primary key (cno, tno)
) engine = innodb
  default charset = utf8mb4 comment '科目信息';
insert into course
values ('c001', 'j2se', 't002');
insert into course
values ('c002', 'java web', 't002');
insert into course
values ('c003', 'ssh', 't001');
insert into course
values ('c004', 'oracle', 't001');
insert into course
values ('c005', 'sql server 2005', 't003');
insert into course
values ('c006', 'c#', 't003');
insert into course
values ('c007', 'javascript', 't002');
insert into course
values ('c008', 'div+css', 't001');
insert into course
values ('c009', 'php', 't003');
insert into course
values ('c010', 'ejb3.0', 't002');

-- 成绩信息
create table score
(
    sno   varchar(10) comment '成绩编号',
    cno   varchar(10) comment '课程编号',
    score int comment '分数',
    constraint pk_sc primary key (sno, cno)
) engine = innodb
  default charset = utf8mb4 comment '成绩信息';
insert into score
values ('s001', 'c001', 78.9);
insert into score
values ('s002', 'c001', 80.9);
insert into score
values ('s003', 'c001', 81.9);
insert into score
values ('s004', 'c001', 60.9);
insert into score
values ('s001', 'c002', 82.9);
insert into score
values ('s002', 'c002', 72.9);
insert into score
values ('s003', 'c002', 81.9);
insert into score
values ('s001', 'c003', '59');
