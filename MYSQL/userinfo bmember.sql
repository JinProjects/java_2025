use mbasic;

select * from userinfo;

create table sboard(
  bno int not null auto_increment primary key,
  bname varchar(100) not null,
  bpass varchar(50) not null,
  btitle varchar(1000) not null,
  bcontent text not null,
  bdate timestamp default current_timestamp,
  bhit int not null default 0,
  bip varchar(50) not null
);
select * from sboard;
create table bmember(
   mid varchar(100) not null primary key,
   mpass varchar(100) not null,
   mnickname varchar(100) not null,
   memail varchar(100) not null,
   address1 varchar(100) not null, -- 시
   address2 varchar(100) not null, -- 구 
   address3 varchar(100) not null,
   mip varchar(100) not null,
   mdate timestamp default current_timestamp
);
insert into bmember(mid, mpass, mnickname, memail, address1, address2, address3,  mip) 
values ('test','1111','test','test@test.com','인천광역시','서구','가정로','127.0.0.1');
drop table bmember;
select * from bmember;
select now();
select * from sboard;
select * from userinfo;
delete from userinfo where no = 14;
desc sboard;
use mbasic;