create table testemp(
	emp_id int not null,
    emp_name varchar(100) not null,
    job varchar(100) not null,
    dept_id int,
    sal int not null,
    bonus int,
    mgr_id int,
    hiredate date not null
);

create table testdept(
dept_id int,
dname varchar(100)
);


insert into testemp values (6200, '민병권', '대표이사', 200, 5000, null,null, '97/12/17');
insert into testemp values (6311, '송지연', '부장', 100, 3500, null,6200, '98/12/17');
insert into testemp values (7489, '김소담', '세일즈', 400, 1850, 200,6321, '99/02/27');
insert into testemp values (7522, '박선영', '세일즈', 400, 1850, 300,6321, '98/02/28');
insert into testemp values (6321, '정순진', '부장', 400, 3800, 500,6200, '99/04/20');
insert into testemp values (6351, '최원석', '부장', 300, 2850, null,6200, '00/05/31');
insert into testemp values (7910, '최준혁', '경리', 300, 1000, null,6351, '01/05/01');
insert into testemp values (6361, '홍경일', '부장', 200, 3200, null,6200, '00/06/09');
insert into testemp values (7878, '박성희', '연구직', 200, 3000, null,6361, '01/06/05');
insert into testemp values (7854, '홍양숙', '세일즈', 400, 1500, 0,6321, '01/09/08');
insert into testemp values (7872, '신현욱', '사무직', 100, 1500, null,6311, '01/02/12');
insert into testemp values (7920, '조성미', '사무직', 300, 1050, null,6351, '01/03/18');
insert into testemp values (7901, '마동석', '연구직', null, 3000, null,null, '01/12/03');
insert into testemp values (7933, '박재영', '사무직', 200, 1050, null,6361, '02/01/02');

insert into testdept values (100, '권리부');
insert into testdept values (200, '경리부');
insert into testdept values (300, '생산부');
insert into testdept values (400, '영업부');


#번외문제
#Q3
select *
from testemp
where dept_id in (select dept_id 
				from testemp
				where sal >= 3000);
                
#Q4
select *
from testemp
where sal > any(select max(sal) from testemp where dept_id = 300);

#Q5
select * 
from testemp
where sal > any(select min(sal) from testemp where dept_id = 300);

#Q6
select *
from testemp
where sal >= any(select sal from testemp where emp_name = '마동석');

#Q7
select d.dept_id, d.dname
from testemp e inner join testdept d
on e.dept_id = d.dept_id
where job = '사무직';

select dept_id, dname
from testdept
where dept_id in (select dept_id from testemp where job = '사무직');

#Q8
select *
from testemp
where dept_id in (
					select dept_id
					from testemp
					where emp_name like '최%');
                    
#Q9
select *
from testemp
where dept_id in(
					select dept_id
					from testdept
					where dname = '경리부');
                    
                    select * from testemp;
#Q10
select *
from testemp
where mgr_id in (select emp_id from testemp where job = '대표이사');

#Q11 문제이해를 잘 못하겠음

select *
from testemp
where sal > any(select avg(sal) from testemp)
and dept_id in (select dept_id from testemp where emp_name like '최%');
select dept_id from testemp where emp_name like '최%';

-- where emp_name like '최%';

#Q12
select * 
from testemp
where sal > all(
				select avg(sal)
				from testemp);
#Q13

select * 
from testemp
where sal > all(
				select avg(sal)
				from testemp
                group by dept_id);
#Q14
select dname
from testdept
where dept_id in(
		select dept_id
		from testemp
		where emp_name = '홍양숙');
#Q15

select *
from testemp
where sal > any(
select max(sal)
from testemp
where dept_id = 100);

