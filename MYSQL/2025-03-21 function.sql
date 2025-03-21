#복습문제
use mbasic;
#Q1 emp 테이블에서 급여가 3000이하인 직원에서
-- 각 부서의 직책별 평규급여가 2000이상인 그룹을 조회하시오.
select deptno, job, avg(sal) from emp
where sal <= 3000
group by deptno, job
having avg(sal) >= 2000
order by deptno;

#Q2 emp 테이블에서 GROUP BY절만  사용하여
-- 각부서의 직책별 사원수, 가장높은 급여, 급여합, 평균급여를 다음과 같이 사원데이터를 조회하시오.
select deptno, job, count(empno), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno;


# ■ select가 안 될 경우 
select @@sql_mode;
set		SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

# ■ function

#1. Number
#2. String
#3. Date
#4. if / case 

#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지)

select CONCAT('Hello World', ' ', '!!!!!!')
FROM DUAL;


select 123.4578, round(123.4578,0), round(123.4578,-1),round(123.4578,1),round(123.4578,2);
select 123.4578, ceil(123.4578), floor(123.4578);

#2. String
-- 2-1. basic
-- 1) length(문자열) 갯수
select length('abc');



-- 2) upper / lower
select upper('abc'), lower('abc');

-- 3) instr 위치
select instr('abc', 'b') `b의 위치`, instr('abc','ab') `ab의 위치`, instr('abc','ac') `ac의 위치`;

-- 4) left, right, substr 문자열 일부분 추출
select left('abc', 1), left('abc',2), right('abc',1), right('abc',2); -- a, ab, c, bc
select substr('abcde', 2, 2) `bc`, substr('abcde',2,3) `bcd`, substr('abcde',1,3) `abc`;

-- 5) 문자열연결 concat(문자열1, 문자열2)
select concat('hello ', 'mysql');

-- 6) trim
select trim(' a b c ') `a b c`;

select concat('#',trim(' a b c '), '#') '#a b c#'
	   ,concat('#',ltrim(' a b c '), '#') `#a b c #`
       , concat('#',rtrim(' a b c '), '#') `# a b c#`;

-- 7) replace(문자열에서, 찾아서, 바꾸기)
select replace('hello sally','sally', 'alpha') `hello alpha`;

-- 8) repeat(문자, 반복)
select repeat('*', 5) `*****`;

-- 9) 빈칸채우기
select lpad('abc', 10, '#')
	,rpad('abc', 10, '#');

-- 1) length(문자열) 갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을 문자열) 위치, 못찾으면 0
-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분
-- 5) 문자열연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백빼기
-- 7) replace(문자열에서, 찾아서, 바꾸기)
-- 8) repeat(문자, 반복)
-- 9) 빈칸채우기


# String 연습문제
# setting
create table fn_select_userinfo2(
  no int not null default 0,
  name varchar(20) not null,
  age int not null,
  email varchar(20)
);

select * from fn_select_userinfo2;
#Q1
select name, length(name)
from fn_select_userinfo2;

#Q2
select name, left(name,1), right(name,1)
from fn_select_userinfo2;

#Q3
select name, replace(name, 'aaa','aaa 1등')
from fn_select_userinfo2;

#Q4
select concat(name,'는 개발자입니다.')
from fn_select_userinfo2;

#Q5
select upper(name)
from fn_select_userinfo2;

#Q6
select lower(name)
from fn_select_userinfo2;

#Q7
select name, instr(name,'b')
from fn_select_userinfo2
where age >= 40;
select * from fn_select_userinfo2;

#Q8
select name, instr(name, 'b')
from fn_select_userinfo2
where age >= 40
having instr(name, 'b') <>0
order by age desc;
-- limit 2

#Q9 
select name, concat(left(name,1),'*',right(name,1))
from fn_select_userinfo2;

#Q10
create table select_userinfo2 select * from fn_select_userinfo2;

select name, concat(left(name,1), repeat('*',length(name)-2),right(name,1))
from select_userinfo2;

select * from select_userinfo2;

#---------------------------------------------------------------
# function part2 
# Date
-- 1) 시스템의 현재 시각조회
select now(); -- '2025-03-21 11:58:33'
select current_time(); -- 현재시간

-- 2) 요일 ( 0 = Mon , 1 = Tue, 6 = Sun)
select weekday(now()); -- 4 = 금
select weekday("2025-03-21");

-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d' )
select date_format('2025-03-21','%Y-%m-%d');
select date_format(now(), '%Y-%m-%d %H:%i:%s');

-- 4) 100일 전/후 date_add
select date_add(now(), interval - 10 day);
select date_add(now(), interval 10 day);
select date_add(now(), interval -3 Hour);

-- 5) datediff(날짜1, 날짜2) 날짜차이
select datediff('2025-03-22',now());
select timestampdiff(hour, '2025-03-22','2025-03-21');


#연습문제
#setting
create table date_userinfo(
  no int not null default 0,
  name varchar(100) not null,
  age int not null,
  date datetime default now()
);

insert into date_userinfo (no, name, age,date)values(1, 'aaa',11,'2022-12-30 00:00:00');
insert into date_userinfo (no, name, age,date)values(2, 'bbb',22,'2022-11-30 00:00:00');
insert into date_userinfo (no, name, age,date)values(3, 'ccc',33,'2022-10-30 00:00:00');
insert into date_userinfo (no, name, age,date)values(4, 'ddd',44,'2022-09-30 00:00:00');
delete from date_userinfo;
#Q1
select * from date_userinfo;

select * from date_userinfo
where date > '2022-11-01';

#Q2
select * from date_userinfo
where date < '2022-11-01';

select date, date_add(date, interval 30 day) from date_userinfo
where date between '2022-12-01' and '2022-12-31';

select date, date_add(date, interval 30 day) from date_userinfo
where month(date) = 12;

#Q3
select name, date_format(date,'%Y년 %m월%d일')
from date_userinfo;

#Q4
select now();

#Q5
select datediff('2025-12-25',now());

#Q6
select date_add(now(),interval 5 month);
#Q7 가장 까가운 일요일 날짜 구하기
select date_add(now(),interval 3-weekday(now()) day);


#4. if / case
-- if(조건, 참, 거짓)
-- 다형식
/*
	case
    when 조건1 then 상태1
    when 조건2 then 상태2
    else 모든 조건에 해당하지 않을 때, 생략가능 
	end
*/

create table control (no int);
insert into control values (1),(2),(3);
select * from control;

-- 1-1
select no, if(no = 1, '1이다','1이 아니다') `상태` from control;

-- 1-2.
select no, if(no > 1, '1보다 크다','1보다 작다') `상태` from control;

-- 1-3. case when/then end
select no, case 
				when no = 1 then '1이다'
                when no = 2 then '2이다'
                when no = 3 then '3이다'
                else '1,2,3 이 아니다'
			end as `state`
from control;            

-- 1-4. 2이다, 크다, 작다
select no, case 
			when no > 2 then '크다'
            when no = 2 then '2이다'
            when no < 3 then '작다'
			end `state`
from control;

#연습문제
#setting
create table if_userinfo(
  no int not null auto_increment primary key,
  name varchar(100) not null,
  age int default 0,
  sex char,
  sns char
);

desc if_userinfo;
insert into if_userinfo (name, age, sex,sns) values ('first',11,null,'n');
insert into if_userinfo (name, age, sex,sns) values ('second',122,'m','y');
insert into if_userinfo (name, age, sex,sns) values ('third',33,'m','y');
insert into if_userinfo (name, age, sex,sns) values ('fourth',44,'f','n');
insert into if_userinfo (name, age, sex,sns) values ('fifth',55,'f','y');
insert into if_userinfo (name, age, sex,sns) values ('sixth',66,'m','n');

#Q1
select no, name, age, sex,sns
	  ,case when sns = 'y' then '수신유지'
					  else '수신거부'
                      end `수신여부상태`
from if_userinfo;

select * from if_userinfo;
#Q2
select no, name, age, sex,sns
	  ,case when age > 19 then '성인'
					  else '미성년자'
                      end `성인여부`
from if_userinfo;
#Q3
select sum(case when sns = 'n' then 1
					  else 0
                      end) `sns수신거부수`
from if_userinfo;

#Q4
select ename, deptno
	, case when deptno = 10 then 'ACCOUNTING'
		   when deptno = 20 then 'RESEARCH'
           when deptno = 30 then 'SALES'
           end `부서이름`
from emp;

#Q5
select ename, job, case when job = 'CLERK' then '판매원'
						when job = 'SALESMAN' then '영업사원'
                        else '사원'
                        end `job2`
from emp;
