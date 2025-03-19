## ■  part001 복습문제

/*****
Q1. milk 테이블의 구조는 다음과 같다 
mysql>
mysql> desc milk;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| mno    | int         | NO   | PRI | NULL    | auto_increment |
| mname  | varchar(20) | NO   |     | NULL    |                |
| mprice | int         | NO   |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
3 rows in set (0.04 sec)
****/
use mbasic;
show tables;
desc milk;

alter table milk  drop  mnum;
alter table milk  drop mtotal;

/***
mysql>
mysql> select * from milk;
+-----+-------+--------+
| mno | mname | mprice |
+-----+-------+--------+
|  1  | white |   1000 |
|  2  | choco |   1200 |
|  3  | banana|   1800 | 
+-----+-------+--------+
6 rows in set (0.03 sec)
  4 , melon ,  5000 데이터를 추가하시오.   
****/
insert into milk  values (1, ' white', 1000);
insert into milk  values (2, ' choco', 1200);
insert into milk  values (3, ' banana', 1800);
insert into milk  (mname, mprice) values ( 'melon' ,  5000);  
## 한줄   실행 ctrl +  enter
## 여러줄 실행 ctrl + shift + enter

/****
 Q2.  mno가 4번인 데이터의 mprice를 1500로 변경하시오.
****/
update milk  set  mprice=1500  where mno=4;
/****
 Q3.  mno가 4번이고 name이 melon인데이터를 삭제하시오.
****/
delete from milk  where  mno=4  and mname='melon';  
/****
 Q4.  milk 데이터를 출력하시오. 
*/
select * from milk;

## ■  part002 진도 - select basic
## 2-1
select * from userinfo;
-- 구조 + 데이터 복사
create table select_userinfo  select * from userinfo;
desc select_userinfo;
alter table select_userinfo modify no int not null  auto_increment primary key;

select * from select_userinfo;

insert into select_userinfo  (name, age)  values ('first',55);
insert into select_userinfo  (name, age)  values ('third',66);

##2-2   ctrl + enter 실행
-- 1. 전체 데이터 검색
select  *  from select_userinfo;
-- 2. 부분검색
select  name, age  from select_userinfo;
-- 3. 중복제거 (distinct)
select  distinct  name    from select_userinfo;
-- 4. 별명
select name as `이름`, age `나이`  from select_userinfo;

-- 5. where 조건 (= 같다,  !=  <> 다르다  , < <=  >  >= )
select * from select_userinfo   where  name = 'second';
select * from select_userinfo   where  name != 'second';
select * from select_userinfo   where  name <> 'second';

select * from select_userinfo   where   age < 33;
select * from select_userinfo   where   age <= 33;
select * from select_userinfo   where   age > 33;  -- 44 55 66
select * from select_userinfo   where   age >= 33; -- 33 44 55 66

-- 6. 모든조건-  and  , between and  / 조건중에 - or , in
select * from select_userinfo   where  age>=22  and age<=33;
select * from select_userinfo   where  age  between  22  and 33;

select * from select_userinfo   where  age=22  or  age=33;
select * from select_userinfo   where  age  in (22,33);

-- 7.  null  검색  ( is null , is not null , not in, not between)
desc select_userinfo;
alter table select_userinfo modify  age int;

select * from select_userinfo;
insert into select_userinfo (name) values ('seven');

## null 값이 비워있다라는 상태 
select * from select_userinfo  where  age =null;  -- (X)
select * from select_userinfo  where  age!=null;  -- (X)

select * from select_userinfo where   age  is     null;
select * from select_userinfo where   age  is not null;

select * from select_userinfo   where  age not between  22  and 33;
select * from select_userinfo   where  age not in (22,33);

-- 8. like 문자열검색 ( like  'a%' , '%a', '%a%', '_a%'  )
select * from select_userinfo where  name  =    'first';
select * from select_userinfo where  name  like 'f%';  -- f로 시작
select * from select_userinfo where  name  like '%t';  -- t로 끝남
select * from select_userinfo where  name  like '%i%';  -- i포함
select * from select_userinfo where  name  like '_e%';  -- 두번째글자e


####  연습문제
-- 실습 0 
create table select_emp  select * from emp;   -- 구조 + 데이터복사
alter table select_emp  modify empno  int not null  auto_increment primary key;
desc select_emp;
select * from select_emp;

-- 실습 1
select * from select_emp;

-- 실습 2
select * from select_emp  where  deptno=30;

-- 실습 3
select * from select_emp  where  deptno=30  and job='SALESMAN';

-- 실습 4
select * from select_emp  where  deptno=30  or job='CLERK';

-- 실습 5
select * from select_emp where sal*12 = 36000;


-- 실습 6
select * from select_emp  where  sal >= 3000;


-- 실습 7
select * from select_emp  where  ename >= 'F';

-- 실습 8
select * from select_emp  where  ename <= 'FORD';

-- 실습 9
select * from select_emp  where  sal != 3000;

-- 실습 10
select * from select_emp  where  sal <> 3000;

##  11~20
-- 11
select * from select_emp    where  not (sal=3000);
select * from select_emp    where  sal not  in (3000);

-- 12
select * from select_emp  where  job='MANAGER'  or job='SALESMAN' or job='CLERK';

-- 13
select * from select_emp  where  job in( 'MANAGER' , 'SALESMAN' , 'CLERK');

-- 14
select * from select_emp  
where  job !='MANAGER'  and job<> 'SALESMAN' and  job !='CLERK';

-- 15 
select * from select_emp  where  job  not in( 'MANAGER' , 'SALESMAN' , 'CLERK');

-- 16
select * from select_emp  where sal >= 2000  and  sal<=3000;

-- 17
select * from select_emp  where sal  between  2000 and 3000;

-- 18
select * from select_emp  where sal   not  between  2000 and 3000;

-- 19 
select * from select_emp  where not (sal >= 2000  and  sal<=3000 );

-- 20
select * from select_emp  where empno=7499  and  deptno=30;


## 21~30
-- 21
select * from select_emp  where  deptno=20  or  job='SALESMAN';

-- 22
select * from select_emp  where  sal>=2500  and  job='ANALYST';

-- 23
select * from select_emp  where  deptno in(10,20);

-- 24
select * from select_emp  where  deptno  not in(10,20);

-- 25
select * from select_emp  where  ename  like  's%';

-- 26
select * from select_emp  where ename  like '_L%';

-- 27
select * from select_emp  where ename  like  '%AM%';

-- 28
select * from select_emp  where ename  not like  '%AM%';

-- 29   숫자 + null 계산안됨.
select ename, sal  , sal*12+comm `annal` , comm 
from select_emp
where    ename  like  '%AM%';


-- 30 
select * from select_emp  where  comm = null;   # X

## 30~40

-- 31
SELECT *  FROM select_emp WHERE COMM  is null;    

-- 32  select_emp 테이블에서 IS NOT NULL을  사용하여  직속상관(MGR)이 있는 사원데이터를  조회하시오.
select * from select_emp  where mgr   is not null; 
 
 
-- 33 null 값없어요 상태
 SELECT * FROM select_emp   WHERE SAL > NULL;
 
-- 34                             null        or  true   => true
SELECT *  FROM select_emp  WHERE SAL > NULL   OR COMM IS NULL;   

-- 35 사원이름이(ename) S로 끝나는 사원데이
select * from select_emp  where  ename  like  '%s';

-- 36 
select  empno, ename, job, sal, deptno
from select_emp    where deptno=30  and job='SALESMAN';
 
-- 37
select  empno, ename, job, sal
from    select_emp
where   deptno in(20,30) and sal>2000;

-- 38  NOT BETWEEN 를 사용하지 않고 급여(sal)가 2000이상 3000이하 
select  empno, ename, job, sal , deptno
from    select_emp
where   sal<2000  or  sal> 3000;


-- 39   부서번호가 30이고/ 이름에 E가 포함되어 있는 사원중 / 급여(sal)가 1000~2000 사이가 아닌 값을 가진 데이터
select ename, job, sal, deptno
from select_emp
where  deptno=30  and  ename like '%E%' and  sal  not between 1000 and 2000;


-- 40  추가수당(comm) 이 없고 / 상급자(mgr)은 존재하며
-- 직책(JOB) 'MANAGER', 'CLERK' 중에서  / 사원이름의 두번째 글자가 L이아닌
select * from select_emp  
where  comm  is null  
  and  mgr is not null  
  and  job  in('MANAGER', 'CLERK')  
  and  ename not like '_L%';



