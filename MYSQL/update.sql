#실습2) update
/* update 테이블명 
     set  필드1 = 값1, 필드2 = 값2
   where 조건
*/

#2-1. 전체데이터 수정
select * from userinfo;
set sql_safe_updates=0; -- error 1175 다수 update 적용
update userinfo
  set age = 0
where no;

#2-2. 바꿀데이터 여러개
update userinfo set age=11 where no=1;
update userinfo set age=22, name='two' where no=2;
update userinfo set name='second' where no=2 and age=22;

select * from userinfo;
#no가 3이고 age가 10인  유저의 이름을 'third' , 나이를 33살로 수정합니다.
update userinfo set name = 'third', age = 33 where no and name = 'third';
-- 조건이 안맞으면 실행X
#no가 4이고 name 'first'인  유저의 이름을 'fourth' , 나이를 44살로 수정합니다.
update userinfo set age=44 where no and name='first';
update userinfo set age=44 where no and name='fourth';

#2-3
select * from userinfo;
update userinfo set age=0 where no;
update userinfo set name = 'first', age=10 where no;
update userinfo set age=11 where no=1;
update userinfo set age=22, name='second' where no =2;

update userinfo set name = 'third', age = 33 where no=3 and age=10;
update userinfo set name = 'fourth', age = 44 where no=4 and name='first';

select * from score;
delete from score where sno;
desc score;

alter table score auto_increment=1;
insert into score (sno,sname,sjava,sjsp,sspring,sproject,sstotal,ssavg,semail)values(null,'aaa', 100,100,100,100,null,null,null);
insert into score (sno,sname,sjava,sjsp,sspring,sproject,sstotal,ssavg,semail)values(null,'bbb', 90,98,88,100,null,null,null);
insert into score (sno,sname,sjava,sjsp,sspring,sproject,sstotal,ssavg,semail)values(null,'ccc', 70,20,78,80,null,null,null);
insert into score (sno,sname,sjava,sjsp,sspring,sproject,sstotal,ssavg,semail)values(null,'ddd', 78,89,68,98,null,null,null);
insert into score (sno,sname,sjava,sjsp,sspring,sproject,sstotal,ssavg,semail)values(null,'eee', 89,98,69,77,null,null,null);

select * from score;
#Q1
update score set sjava=90,sjsp=90,sspring=90 where sno and sname = 'ccc';
#Q2
update score set semail = 'admin@gmail.com' where sno;
#Q3
update score set sstotal = sjava+sjsp+sspring+sproject where sno;
#Q4
update score set ssavg = (sjava+sjsp+sspring+sproject)/4 where sno;
#Q5
update score set semail = 'first@gmail.com' where sno and ssavg = 100;
#Q6
update score set sjava=92,sjsp=78,sstotal=sjava+sjsp+sspring+sproject,
									ssavg=sstotal/4 where sno and sname = 'bbb';

update score set sjava = 92, sjsp=78 where sno and sname = 'bbb';
update score set sstotal = sjava+sjsp+sspring+sproject where sno and sname = 'bbb';
update score set ssavg = (sjava+sjsp+sspring+sproject)/4 where sno and sname = 'bbb';
#Q7
desc score;
alter table score modify ssavg double;
update score set semail = 'second@gmail.com', sname = 'second' where sno and ssavg = 89.5;
#Q8
update score set semail = 'ccc@gmail.com' where sno and sname = 'ccc';
#Q9
update score set semail = 'blacksdudent@gmail.com' where sno and sproject < 80;
#Q10
update score set semail = 'hello@gmail.com' where sno and ssavg=89.5;
update score set semail = 'hello@gmail.com' where sno and sproject=98 or sno and ssavg=89.5;
select *from score;