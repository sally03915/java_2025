## ■ 1.  order by  + limit
/*  
select   필드1, 필드2
from     테이블명
where    조건식 
order by 기준필드  [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
limit    몇개
*/
-- 1-1 테이블준비
use mbasic;
show tables;
select * from select_userinfo;
delete from select_userinfo  where  no=7;

-- 1-2. 정렬
select * from select_userinfo;

select * from select_userinfo order by age  desc; -- 내림
select * from select_userinfo order by age  asc;  --  오름

-- 나이많은 3명
select * from select_userinfo  order by age desc limit 3;
select * from select_userinfo  order by age desc limit 2;

-- no가 높은순으로 4명
select * from select_userinfo  order by no desc limit 4;

-- no가 두번째로 높은순으로 2명( limit 1, 2)  limit  어디서부터, 몇개
select * from select_userinfo  order by no desc limit 0, 2; -- 6,5
select * from select_userinfo  order by no desc limit 1, 2; -- 5,4

-- 1-3 연습문제   select_emp  
-- 실습 1.  emp테이블을   select_emp이름으로 복사하시오. (있다면 pass)
-- 실습 2.  JOB이 'SALESMAN'인 레코드를 조회하시오.
/*
+-------+--------+----------+------+------------+------+------+--------+
| select_empno | ename  | job      | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+----------+------+------------+------+------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500 |    0 |     30 |
+-------+--------+----------+------+------------+------+------+--------+
4 rows in set (0.00 sec) */

select * from select_emp;
select * from select_emp  where job='SALESMAN';
 

 

-- 실습 3. select_emp 테이블에서 ename, mgr, sal  필드를 조회하시오.   
/*
+--------+------+------+
| ename  | mgr  | sal  |
+--------+------+------+
| SMITH  | 7902 |  800 |
| ALLEN  | 7698 | 1600 |
| WARD   | 7698 | 1250 |
| JONES  | 7839 | 2975 |
| MARTIN | 7698 | 1250 |
| BLAKE  | 7839 | 2850 |
| CLARK  | 7839 | 2450 |
| SCOTT  | 7566 | 3000 |
| KING   | NULL | 5000 |
| TURNER | 7698 | 1500 |
| ADAMS  | 7788 | 1100 |
| JAMES  | 7698 |  950 |
| FORD   | 7566 | 3000 |
| MILLER | 7782 | 1300 |
+--------+------+------+
14 rows in set (0.00 sec)
*/
select ename, mgr, sal      from select_emp;



-- 실습 4. select_emp 테이블에서 JOB이 'SALESMAN'인 레코드의  ename, mgr, sal  필드를 조회하시오.     
/*-------+------+------+
| ename  | mgr  | sal  |
+--------+------+------+
| ALLEN  | 7698 | 1600 |
| WARD   | 7698 | 1250 |
| MARTIN | 7698 | 1250 |
| TURNER | 7698 | 1500 |
+--------+------+------+
4 rows in set (0.00 sec)  */

select ename, mgr, sal      from select_emp  where job='SALESMAN';

 
    
-- 실습 5. select_emp 테이블에서  급여(SAL)가 높은 순서로  조회하시오.     
/*
+-------+--------+-----------+------+------------+------+------+--------+
| select_empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
 -- sal을 기준으로 내림차순 정렬. 
select * from select_emp order by sal  desc;
 

-- 실습 6. select_emp 테이블에서  Job기준으로 올림차순, 같으면 sal을 기준으로 내림차순으로 정렬하시오.
select * from select_emp order by job asc , sal  desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| select_empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
   
 -- Job기준으로 올림차순, 같으면 sal을 기준으로 내림차순정렬 


-- 실습 7. select_emp 테이블에서  
-- sal가 2000이상인 레코드 들중에  ename, sal, select_empno필드를 
--  select_empno를 기준으로 내림차순 정렬하시오. 
select   ename, sal, empno  `select_empno`
from     select_emp
where    sal > 2000
order    by  select_empno desc;
/*
+-------+------+-------+
| ename | sal  | select_empno |
+-------+------+-------+
| FORD  | 3000 |  7902 |
| KING  | 5000 |  7839 |
| SCOTT | 3000 |  7788 |
| CLARK | 2450 |  7782 |
| BLAKE | 2850 |  7698 |
| JONES | 2975 |  7566 |
+-------+------+-------+
6 rows in set (0.00 sec)
*/
  -- sal가 2000이상인 레코드 들중에 ename, sal, select_userinfono를
  -- 가져오데 select_empno를 기준으로 내림차순 정렬 

    
    
-- 실습 8. select_emp 테이블에서    job을 기준으로 중복행은 제거하여 같은것은 한번만 나오게 출력하시오
-- 중복행제거 distinct
select distinct  job  from select_emp;
/*
+-----------+
| job       |
+-----------+
| CLERK     |
| SALESMAN  |
| MANAGER   |
| ANALYST   |
| PRESIDENT |
+-----------+
5 rows in set (0.00 sec) */
    
    

    
-- 실습 9.  select_emp 테이블에서    select_empno ( 사원번호 ) , ename ( 이름) , job ( 담담 업무)  필드를 
-- 다음과 같이 필드명을 바꿔(별명으로) 출력하시오.
select  empno  as `사원번호`   , ename  `이름` , job `담당 업무`
from  select_emp;
/*
+----------+--------+-----------+
| 사원번호 | 이름   | 담담 업무 |
+----------+--------+-----------+
|     7369 | SMITH  | CLERK     |
|     7499 | ALLEN  | SALESMAN  |
|     7521 | WARD   | SALESMAN  |
|     7566 | JONES  | MANAGER   |
|     7654 | MARTIN | SALESMAN  |
|     7698 | BLAKE  | MANAGER   |
|     7782 | CLARK  | MANAGER   |
|     7788 | SCOTT  | ANALYST   |
|     7839 | KING   | PRESIDENT |
|     7844 | TURNER | SALESMAN  |
|     7876 | ADAMS  | CLERK     |
|     7900 | JAMES  | CLERK     |
|     7902 | FORD   | ANALYST   |
|     7934 | MILLER | CLERK     |
+----------+--------+-----------+
14 rows in set (0.00 sec)

 * 컬럼명에 별칭주기(as) 
*/

 


-- 실습 10 select_emp 테이블에서 급여를 기준으로 오름차순으로 정렬하여 조회하시오.
select * from select_emp order by sal;
select * from select_emp order by sal asc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| select_empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
 




-- 실습 11 select_emp 테이블에서 급여를 기준으로 내차순으로 정렬하여 조회하시오.
select * from select_emp order by sal desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| select_empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
 */



-- 실습 12 select_emp테이블에서 1순위는 부서번호를 (deptno)를 기준으로 오름차순, 
-- 그중에서도 급여를기준으로(sal) 내림차순으로 정렬하시오.
select * from select_emp order by deptno asc , sal  desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| select_empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
 */


-- 실습 13. 다음의 결과가나오게 조회하시오.
select    empno `select_empLOYEE_NO` ,  ename `select_empLOYEE_NAME` ,  job , 
          mgr   `MANAGER`  , hiredate , sal `SALARY` , comm `COMMISSION` , deptno `DEPARTMENT_NO`
from      select_emp
order by  deptno  desc,  ename asc;

/*
+-------------+---------------+-----------+---------+------------+--------+------------+---------------+
| select_empLOYEE_NO | select_empLOYEE_NAME | JOB       | MANAGER | HIREDATE   | SALARY | COMMISSION | DEPARTMENT_NO |
+-------------+---------------+-----------+---------+------------+--------+------------+---------------+
|        7499 | ALLEN         | SALESMAN  |    7698 | 1981-02-20 |   1600 |        300 |            30 |
|        7698 | BLAKE         | MANAGER   |    7839 | 1981-05-01 |   2850 |       NULL |            30 |
|        7900 | JAMES         | CLERK     |    7698 | 1981-12-03 |    950 |       NULL |            30 |
|        7654 | MARTIN        | SALESMAN  |    7698 | 1981-09-28 |   1250 |       1400 |            30 |
|        7844 | TURNER        | SALESMAN  |    7698 | 1981-09-08 |   1500 |          0 |            30 |
|        7521 | WARD          | SALESMAN  |    7698 | 1981-02-22 |   1250 |        500 |            30 |
|        7876 | ADAMS         | CLERK     |    7788 | 1987-05-23 |   1100 |       NULL |            20 |
|        7902 | FORD          | ANALYST   |    7566 | 1981-12-03 |   3000 |       NULL |            20 |
|        7566 | JONES         | MANAGER   |    7839 | 1981-04-02 |   2975 |       NULL |            20 |
|        7788 | SCOTT         | ANALYST   |    7566 | 1987-04-19 |   3000 |       NULL |            20 |
|        7369 | SMITH         | CLERK     |    7902 | 1980-12-17 |    800 |       NULL |            20 |
|        7782 | CLARK         | MANAGER   |    7839 | 1981-06-09 |   2450 |       NULL |            10 |
|        7839 | KING          | PRESIDENT |    NULL | 1981-11-17 |   5000 |       NULL |            10 |
|        7934 | MILLER        | CLERK     |    7782 | 1982-01-23 |   1300 |       NULL |            10 |
+-------------+---------------+-----------+---------+------------+--------+------------+---------------+
14 rows in set (0.00 sec)

mysql>
 
 */



## ■ 2.  집계함수
/*  
select   필드1, 필드2
from     테이블명
where    조건식 
group by  그룹핑
having    조건식
order by 기준필드  [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
limit    몇개

avg(컬럼명) 평균, max 최대값, min 최소값 , sum 합계 , count 갯수

*/
-- 2-1 테이블준비
/*
mysql> desc group_userinfo;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| no    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | NO   |     | NULL    |                |
| age   | int         | NO   |     | NULL    |                |
| sex   | char(2)     | YES  |     | NULL    |                |
| kor   | int         | YES  |     | NULL    |                |
| eng   | int         | YES  |     | NULL    |                |
| math  | int         | YES  |     | NULL    |                |
| ban   | char(2)     | YES  |     | NULL    |                |
| sns   | char(2)     | YES  |     | y       |                |
+-------+-------------+------+-----+---------+----------------+
9 rows in set (0.00 sec)

mysql>
mysql> select * from group_userinfo;
+----+--------+-----+------+------+------+------+------+------+
| no | name   | age | sex  | kor  | eng  | math | ban  | sns  |
+----+--------+-----+------+------+------+------+------+------+
|  1 | first  |  11 | NULL |  100 |  100 |   99 | A    | n    |
|  2 | second |  22 | m    |   89 |   92 |   78 | B    | y    |
|  3 | third  |  33 | m    |   90 |   92 |   97 | A    | y    |
|  4 | fourth |  44 | f    |   40 |   42 |   67 | C    | n    |
|  5 | fifth  |  55 | f    |   89 |   86 |   99 | B    | y    |
|  6 | sixth  |  66 | m    |   10 |   20 |   44 | C    | n    |
+----+--------+-----+------+------+------+------+------+------+
6 rows in set (0.00 sec)

mysql>

*/


CREATE TABLE group_userinfo ( 
  no int not null auto_increment primary key ,  
  name varchar(20) not null , 
  age int not null ,  
  sex char(2) , 
  kor int , 
  eng int, 
  math int, 
  ban char(2),
  sns char(2) default 'y'
);

insert into  group_userinfo (name, age , sns , kor , eng, math , ban) values ('first' , 11 , 'n' , 100 , 100 , 99 , 'A');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('second' , 22 , 'm' , 89 , 92 , 78 , 'B');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('third', 33 , 'm' , 90, 92,97,'A');
insert into  group_userinfo (name, age, sex , sns , kor , eng, math , ban) values ('fourth' , 44 , 'f' , 'n' , 40,42,67 , 'C');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('fifth', 55 , 'f' , 89 , 86 , 99 , 'B');
insert into  group_userinfo (name, age, sex, sns , kor , eng, math , ban) values ('sixth', 66 , 'm', 'n' , 10,20,44 , 'C');
 
-- 2-2 기본
select * from group_userinfo group by ban;  -- 1
select  @@sql_mode;  -- 2
set  SESSION  sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
select * from group_userinfo;
select * from group_userinfo group by ban; -- 4

-- 나이평균 
select  avg(age) from group_userinfo;

-- 반별 몇명있는지
select * from group_userinfo;
select  ban, count(*)  from group_userinfo  group by ban;

-- 반별 국, 영, 수의 총점 확인
select ban, sum(kor) `국어총합` , sum(eng) `영어총합` , sum(math) `수학총합`  
from   group_userinfo
group  by ban;


-- 반별 국, 영, 수의 평균 확인  ## 도전!
select  ban, avg(kor) `국어평균` , avg(eng) `영어평균` , avg(math) `수학평균`
from    group_userinfo
group   by ban;

-- 반별 나이의 총합과 나이 평균 확인  ## 도전!
select ban,  sum(age) `나이총합` , avg(age) `나이평균` , max(age) `최고나이` , min(age) `최저나이`
from   group_userinfo
group  by ban;

-- 반별 국영수의 평균 확인후 '국어'평균점수가 89이상인 데이터만 고르기
select  ban,  avg(kor) `국어평균`
from    group_userinfo
group   by  ban
having  avg(kor) >= 89;


-- 반별 나이의 총합과 나이 평균 확인후 
-- 그중에서 나이의 평균이 35세 이상인 데이터 추출후  
-- 평균나이의 내림차순으로 정렬하시오.    
select   ban, sum(age) `나이의 총합` , avg(age) `나이의 평균`
from     group_userinfo
group    by   ban
having   avg(age) >= 35
order by avg(age) desc;

/*  
select   필드1, 필드2
from     테이블명
where    조건식 
group by  그룹핑
having    조건식
order by 기준필드  [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
limit    몇개

avg(컬럼명) 평균, max 최대값, min 최소값 , sum 합계 , count 갯수

*/


-- 2-3 연습문제
/*
mysql> desc emp;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| empno    | int         | NO   | PRI | NULL    | auto_increment |
| ename    | varchar(20) | YES  |     | NULL    |                |
| job      | varchar(20) | YES  |     | NULL    |                |
| mgr      | int         | YES  |     | NULL    |                |
| hiredate | date        | YES  |     | NULL    |                |
| sal      | int         | YES  |     | NULL    |                |
| comm     | int         | YES  |     | NULL    |                |
| deptno   | int         | YES  |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
8 rows in set (0.00 sec)

mysql> select * from emp;
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
 
#--------------------------------------------------------
#--------------------------------------------------------
-- 연습문제-1
-- emp 테이블에서  SUM함수를 사용하여 급여합계를  조회하시오. 
/*
+----------+
| 급여합계 |
+----------+
|    29025 |
+----------+
1 row in set (0.00 sec)
*/
 
select sum(sal)  `급여합계` from emp; 

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-2
-- emp 테이블에서  SUM함수를 사용하여 추가수당(COMM)합계를  조회하시오. 
+----------+
| 추가수당 |
+----------+
|     2200 |
+----------+
1 row in set (0.00 sec)
*/
select sum(comm)  `추가수당`  from emp;
       

/*
--------------------------------------------------------
-------------------------------------------------------- 
-- 연습문제-3
-- emp 테이블에서  SUM함수를 사용하여 다음과 같이  조회하시오. 
+-------------------+--------------+----------+
| sum(distinct sal) | sum(all sal) | sum(sal) |
+-------------------+--------------+----------+
|             24775 |        29025 |    29025 |
+-------------------+--------------+----------+
1 row in set (0.00 sec)
mysql>
*/
select   sum(distinct sal) ,  sum(all sal) ,  sum(sal)  from emp;

 

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-4
-- emp 테이블의 레코드 갯수를  조회하시오. 
+------------+
| 데이터갯수 |
+------------+
|         14 |
+------------+
1 row in set (0.00 sec)
*/
select count(*)       `데이터갯수` from emp;  -- 모든필드
select count(empno)   `데이터갯수` from emp;  -- 모든필드가 값 다 있는 필드 14 
select count(comm)    `데이터갯수` from emp;  -- null 값이 있는필드는 제외  4
 
/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-5
-- emp 테이블에서 부서번호가 30인 직원수를   조회하시오. 
+---------------+
| 부서30 직원수 |
+---------------+
|             6 |
+---------------+
1 row in set (0.00 sec)

mysql>
*/
select count(*) `부서30 직원수`  from emp    where deptno=30;

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-6
-- emp 테이블에서  COUNT를 사용하여 다음과 같이  조회하시오.
+---------------------+----------------+------------+
| count(distinct sal) | count(all sal) | count(sal) |
+---------------------+----------------+------------+
|                  12 |             14 |         14 |
+---------------------+----------------+------------+
1 row in set (0.00 sec)

mysql>
*/

select count(distinct sal) , count(all sal) , count(sal)  from emp;

 

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-7
-- emp 테이블에서  count를 이용하여 추가수당을 받는 (comm) 사원수를  조회하시오.
+------------------------+
| 추가수당을받는 사원수       |
+------------------------+
|                      4 |
+------------------------+
1 row in set (0.00 sec)
*/
select  count(comm)   `추가수당을받는 사원수`  from emp;



/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-8
-- emp 테이블에서  IS NOT NULL을  이용하여 추가수당을 받는 (comm) 사원수를  조회하시오. 
+------------------------+
| 추가수당을받는 사원수       |
+------------------------+
|                      4 |
+------------------------+
1 row in set (0.00 sec)
*/
select  count(comm)   `추가수당을받는 사원수`  from emp  where  comm  is not null;

 
/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-9
-- emp 테이블에서  부서번호가 10번인 사원들의 최대 급여를   조회하시오. 
+-----------------+
| 부서10 최대급여    |
+-----------------+
|            5000 |
+-----------------+
1 row in set (0.00 sec)
*/  
select max(sal)  `부서10 최대급여`   from emp where deptno=10;


/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-10
-- emp 테이블에서  부서번호가 10번인 사원들의 최소 급여를   조회하시오.
+-----------------+
| 부서10 최소급여 |
+-----------------+
|            1300 |
+-----------------+
1 row in set (0.00 sec) 
*/ 
select min(sal)  `부서10 최소급여`   from emp where deptno=10;
   

/*  #11~20
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-11
-- emp 테이블에서  부서번호가 20번인 사원들의 입사일 중 제일 최근의 입사일을   조회하시오. 
+-------------------+
| 부서20 최근입사일 |
+-------------------+
| 1987-05-23        |
+-------------------+
1 row in set (0.00 sec)

mysql>
*/

 

--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-12
-- emp 테이블에서  부서번호가 20번인 사원들의 입사일 중 제일 오래된  입사일을   조회하시오. 
+---------------------------+
| 부서20 제일오래 된 입사일 |
+---------------------------+
| 1980-12-17                |
+---------------------------+
1 row in set (0.00 sec)

 


--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-13
-- emp 테이블에서  부서번호가 30번인 사원들의 평균급여를  조회하시오. 
+-----------------+
| 부서30 평균급여 |
+-----------------+
|       1566.6667 |
+-----------------+
1 row in set (0.00 sec)


 
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-14
-- emp 테이블에서  부서번호가 30번인 사원들의  distinct를 이용하여 중복을 제거한 급여열의 평균급여를  조회하시오. 
+--------------------------+
| 부서30 중복제거 급여평균 |
+--------------------------+
|                1630.0000 |
+--------------------------+
1 row in set (0.00 sec)
 


 

--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-15
-- emp 테이블에서 group by를 사용하여  부서별 평균급여를  조회하시오. 
+--------+-----------+
| deptno | 평균급여    |
+--------+-----------+
|     10 | 2916.6667 |
|     20 | 2175.0000 |
|     30 | 1566.6667 |
+--------+-----------+
3 rows in set (0.00 sec)
 
 
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-16
-- emp 테이블에서  부서번호 및 직책별 평균급여로 정렬하여 다음과 같이 조회하시오. 
+--------+-----------+-----------+
| deptno | job       | 평균급여  |
+--------+-----------+-----------+
|     10 | CLERK     | 1300.0000 |
|     10 | MANAGER   | 2450.0000 |
|     10 | PRESIDENT | 5000.0000 |
|     20 | ANALYST   | 3000.0000 |
|     20 | CLERK     |  950.0000 |
|     20 | MANAGER   | 2975.0000 |
|     30 | CLERK     |  950.0000 |
|     30 | MANAGER   | 2850.0000 |
|     30 | SALESMAN  | 1400.0000 |
+--------+-----------+-----------+
9 rows in set (0.00 sec)



 
 

--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-17
-- emp 테이블에서  각 부서의 직책별 평균급여를 구하되 그평균급여가 2000이상인 그룹만   조회하시오. 
+--------+-----------+-----------+
| deptno | job       | 평균급여  |
+--------+-----------+-----------+
|     10 | MANAGER   | 2450.0000 |
|     10 | PRESIDENT | 5000.0000 |
|     20 | ANALYST   | 3000.0000 |
|     20 | MANAGER   | 2975.0000 |
|     30 | MANAGER   | 2850.0000 |
+--------+-----------+-----------+
5 rows in set (0.00 sec)

 
 
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-18
-- emp 테이블에서  각 부서의 직책별 평균급여를 구하되 그평균급여가 2000이상인 그룹만   조회하시오.
-- 다음코드를 작성해보고 오류가 난다면 오류가 나는 이유를 적으시오.
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
  WHERE AVG(SAL) >= 2000  
  GROUP BY DEPTNO, JOB
  ORDER BY DEPTNO, JOB;

  


--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-19
-- emp 테이블에서  급여가 3000이하인 직원에서  
-- 각 부서의 직책별 평균급여가 2000이상인 그룹을 조회하시오. 
+--------+---------+-----------+
| deptno | job     | 평균급여  |
+--------+---------+-----------+
|     10 | MANAGER | 2450.0000 |
|     20 | ANALYST | 3000.0000 |
|     20 | MANAGER | 2975.0000 |
|     30 | MANAGER | 2850.0000 |
+--------+---------+-----------+
4 rows in set (0.00 sec)


--------------------------------------------------------
-------------------------------------------------------- ##
-- 연습문제-20
-- emp 테이블에서 GROUP BY절만  사용하여  
-- 각부서의 직책별 사원수, 가장높은 급여, 급여합, 평균급여를  다음과 같이  사원데이터를  조회하시오. 
+--------+-----------+--------+----------+--------+-----------+
| deptno | job       | 사원수   | 최고급여   | 급여합   | 평균급여   |
+--------+-----------+--------+----------+--------+-----------+
|     10 | CLERK     |      1 |     1300 |   1300 | 1300.0000 |
|     10 | MANAGER   |      1 |     2450 |   2450 | 2450.0000 |
|     10 | PRESIDENT |      1 |     5000 |   5000 | 5000.0000 |
|     20 | ANALYST   |      2 |     3000 |   6000 | 3000.0000 |
|     20 | CLERK     |      2 |     1100 |   1900 |  950.0000 |
|     20 | MANAGER   |      1 |     2975 |   2975 | 2975.0000 |
|     30 | CLERK     |      1 |      950 |    950 |  950.0000 |
|     30 | MANAGER   |      1 |     2850 |   2850 | 2850.0000 |
|     30 | SALESMAN  |      4 |     1600 |   5600 | 1400.0000 |
+--------+-----------+--------+----------+--------+-----------+
9 rows in set (0.00 sec)

mysql>

 




