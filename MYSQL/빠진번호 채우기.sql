use mbasic;
select * from member;
desc member;
select count(*) cnt, name, pass from member where name = 'first' and pass = 11;

create table board(
 bno    int     not null      auto_increment          primary key ,
 btitle  varchar(1000)   not null,
 bcontent  text     not null,
 bname  varchar(100)   not null,
 bhit    int  not null   default 0,
bdate  timestamp  not null   default current_timestamp ,
 bip    varchar(100) not null
);

insert into board (btitle, bcontent, bname, bip) values ('안녕하세요','내용','second','192.168.40.93');


desc board;
select * from board;

select row_number() over(order by bno) bno,btitle,bcontent
 from board order by bno desc;
 
 update board
 set bno = (bno+1)
 where bno = 3;
 delete from board where bno = 32;
 update board  
    set bno = (bno-1)
 where bno >= (select bno from (select b.bno
			   from board a right join
					(select bno 
						from (select row_number() over(order by bno) as bno 
										from board) board2 ) b
			on a.bno = b.bno
			where a.bno is null) as t
            limit 1);
            
			-- on a.bno = b.bno;
 select * from board order by bno desc;
 
select * from board;
select *
   from board a
   where exists (select bno 
					from (select row_number() over(order by bno) bno from board) b 
				 where b.bno = a.bno
                    );

select * from board;
select b.bno
   from board a right join
		(select bno 
			from (select row_number() over(order by bno) as bno 
							from board) board2 ) b
on a.bno = b.bno
where a.bno is null
limit 1;

select bno 
			from (select row_number() over(order by bno) as bno 
							from board) a;