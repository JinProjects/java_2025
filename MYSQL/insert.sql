# 1. rdb : 관계형데이터베이스 - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
# 2. 데이터베이스 언어
# 정의어 DDL - create, alter, drop - CAD
# 조작어 DML - insert, select, update, delete - C(create)R(read)U(update)D(delete)
# 제어어 DCL - grant, revoke

#실습1) insert
use mbasic;
show tables;
desc userinfo;

#1-1 구조와 순서를 알고 있을 때
/*
mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

*/
insert into userinfo values (1, 'first', 11);
insert into userinfo values ('second',22,2); # 필드 순서 안맞음!
#Error Code: 1366. Incorrect integer value: 'second' for column 'no' at row 1	0.000 sec
select * from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo (name, age) values ('second',22);
#1 row(s) affected

insert into userinfo (age,name) values (33,'third');
insert into userinfo (age,name) values (44,'fourth');
select * from emp;
delete from emp where empno = 7934;
desc emp;
insert into emp values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);

insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30);
insert into emp values (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,null,10);
insert into emp values (7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,null,20);
insert into emp values (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,null,10);
insert into emp values (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
insert into emp values (7876,'ADAMS','CLERK',7788,'1987-05-23',1100,null,20);
insert into emp values (7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30);
insert into emp values (7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20);
insert into emp values (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);


select * from dept;
insert into dept values (10, 'ACCOUNTING','NEW YORK');
insert into dept values (20, 'RESEARCH','DALLAS');
insert into dept values (30, 'SALES','CHICAGO');
insert into dept values (40, 'OPERATIONS','BOSTON');
desc salgrade;
select * from salgrade where grade;
delete from salgrade  where grade=6;
use mbasic;

insert into salgrade values (1, 700,1200);
insert into salgrade values (2, 1201,1400);
insert into salgrade values (3, 1401,2000);
insert into salgrade values (4, 2001,3000);
insert into salgrade values (5, 3001,9999);
