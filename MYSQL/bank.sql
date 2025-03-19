create table bank(
 no int not null auto_increment primary key,
 id varchar(100) not null,
 pass varchar(100) not null,
 balance double default 0,
 bdate timestamp default now(),
 ip varchar(100) not null
);
select * from bank where id = 'a';
insert into bank (id, pass, balance, ip)values('a','1111',23,'111.11.11');
select * from bank;
delete from bank where no;
drop table bank;