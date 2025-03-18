#실습3) delete
-- 준비
create table userinfo_delete select * from userinfo;
alter table userinfo_delete add primary key(no);
alter table userinfo_delete modify no int not null auto_increment;

desc userinfo_delete;
select * from userinfo_delete;

/*
	delete from 테이블명
    where 조건식
*/

#3-1 age가 11인 유저 삭제
select * from userinfo_delete;
delete from userinfo_delete where no and age=11;

# 이름이 second이고 나이가 22살인 유저
delete from userinfo_delete where no and name='second' and age=22;

# 전체데이터삭제
delete from userinfo_delete where no;

#3-2 연습문제

-- emp 테이블을 구조+데이터복사해서 emp_del 준비
create table emp_del select * from emp;
select * from emp_del;
alter table emp_del add primary key(empno);
alter table emp_del modify empno int not null auto_increment;

desc emp_del;
#Q1 
delete from emp_del where empno and job = 'SALESMAN';
#Q2
delete from emp_del where job = 'MANAGER' and ENAME = 'JONES';
#Q3
delete from emp_del;



