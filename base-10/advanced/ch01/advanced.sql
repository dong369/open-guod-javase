# 一、触发器(trigger)
# 需求：当下1个订单时，对应的商品要相应减少（买几个商品就少几个库存）
# 表结构：goods(商品表)、order(订单表)
# 分析：监视谁：ord；监视动作：insert；触发时间：after；触发事件：update

use test;

# 触发器格式
create trigger t1
    after
        insert
    on goods
    for each row
begin
    select new date ;
end;


# 二、存储过程(procedure)
# 需求：当下1个订单时，对应的商品要相应减少（买几个商品就少几个库存）
# 表结构：goods(商品表)、order(订单表)
# 分析：监视谁：ord；监视动作：insert；触发时间：after；触发事件：update

# 存储过程格式
create procedure procedure_info01()
begin
    select * from test.girl;
end;

# 存储过程+公共表达式
create procedure procedure_info02()
begin
    with cte1 as (select * from girl),
         cte2 as (select * from boy)
    select *
    from cte1,
         cte2
    where cte1.hid = cte2.hid;
end;

# 基本带参
create procedure procedure_info03(width int, height int)
begin
    select width * height;
    with cte1 as (select * from girl),
         cte2 as (select * from boy)
    select *
    from cte1,
         cte2
    where cte1.hid = cte2.hid;
end;

# in/out/inout
create procedure procedure_info04(in width int, out height int)
begin
    select width * height;
    with cte1 as (select * from girl),
         cte2 as (select * from boy)
    select *
    from cte1,
         cte2
    where cte1.hid = cte2.hid;
end;

show procedure status;
drop procedure if exists p2;
call procedure_info01();
call procedure_info02();
call procedure_info03(12, 5);
call procedure_info04(12, 5);


# 三、游标(cursor)
# 需求：当下1个订单时，对应的商品要相应减少（买几个商品就少几个库存）
# 表结构：goods(商品表)、order(订单表)
# 分析：监视谁：ord；监视动作：insert；触发时间：after；触发事件：update
# 定义： cursor for来定义游标

drop procedure if exists cursor_info;
create procedure cursor_info()
begin
    declare flag boolean default 0; -- 结束标识
    declare row_id int; -- 定义局部变量
    declare getGoods cursor for select goods_id from goods; -- 定义游标
    declare continue handler for sqlstate '02000' set flag = 1; -- 当出现02000错误时把局部变量的值设为true
    open getGoods; -- 打开游标
    repeat
        fetch getGoods into row_id;
        insert into a(num) values (row_id);
    until flag end repeat;
    close getGoods; -- 关闭游标
end;

show procedure status;

call cursor_info();