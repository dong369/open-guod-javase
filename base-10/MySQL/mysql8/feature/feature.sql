use test;
with cte1 as (select * from test.girl),
     cte2 as (select * from test.boy)
select *
from cte1,
     cte2
where cte1.hid = cte2.hid;