select * from milk;
alter table milk auto_increment =1;
delete from milk;

insert into milk (mname, mprice) values('white',1000);
insert into milk (mname, mprice) values('choco',1200);
insert into milk (mname, mprice) values('banana',1800);
insert into milk (mname, mprice) values('melon',5000);
insert into milk (mname, mprice) values ('coffee',1500);
insert into milk (mname, mprice) values ('white',1500);

create table coffee(
  cno int not null default 0,
  cname varchar(50) not null,
  cprice int not null
);

insert into coffee values (1, '아메리카노',2000);
insert into coffee values (2, '까페라떼',2500);
insert into coffee values (3, '아메리카노',2000);
insert into coffee values (4, '아메리카노',2000);
insert into coffee values (5, '카푸치노',2500);
insert into coffee values (6, '아메리카노',2000);
insert into coffee values (7, '아메리카노',2000);
insert into coffee values (8, '바나나라떼',2500);

delete from coffee;
select * from coffee;
update score set sname = 'abc' where sname = 'eee';
select * from score;
select * from score order by ssavg desc limit 3;
select * from score where ssavg between 85 and 90;

select * from milk_order;

create table milk_order (
  ono int not null auto_increment primary key,
  oname varchar(20) not null,
  onum int not null,
  odate datetime default now(),
  oip varchar(100) not null
);
desc milk_order;
drop table milk_order;
alter table milk_order modify odate datetime default now();


#1
insert into milk_order (oname,onum,oip) value('white',2,'127.0.0.1');
#2
select * from milk_order where no=1;
#3
select * from milk_order;
#4
 update milk_order set oname = 'choco' where ono =1;
#5
delete from milk_order where ono = 1;


