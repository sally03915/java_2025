# 1. rdb : 관계형데이터베이스  - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
# 2. 데이터베이스 언어 
#   정의어  DDL - create, alter, drop - cad
#   조작어  DML - insert, select, update, delete  -   crud 
#   제어어  DCL - grant, revoke


#   조작어  DML - insert, select, update, delete  -   crud 
#   조작어  DML - insert, select, update, delete  -   crud 
#실습1) insert
use mbasic;
show tables;
desc userinfo;

#1-1 구조와 순서를 알고 있을때 
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
dml : insert ,select, update, delete
*/
insert into  userinfo  values (1, 'first', 11);
insert into  userinfo  values ('second' , 22, 2); # 필드 순서 안맞음!
# Error Code: 1366. Incorrect integer value: 'second' for column 'no' at row 1	0.000 sec
select   * from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo  (name, age)  values ( 'second' , 22);
# 1 row(s) affected

insert into userinfo  (age,name)  values ( 33 , 'third');
select * from userinfo;


#연습문제1)
/*
[001] 다음과 같이 데이터를 삽입하시오
mysql> select * from emp;
+-------+--------+-----------+------+------------+------+------+------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | dept |
+-------+--------+-----------+------+------------+------+------+------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |   20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |   30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |   30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |   20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |   30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |   30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |   10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |   20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |   10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |   30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |   20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |   30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |   20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |   10 |
+-------+--------+-----------+------+------------+------+------+------+
14 rows in set (0.00 sec)

mysql>
*/
drop table emp;
create table emp  (
	empno    int   not null  auto_increment primary key,
 	ename     varchar(20) not null ,
 	job       varchar(20) ,
 	mgr       int,
 	hiredate  date,
	sal       int,
	comm      int,
	deptno      int
);
insert into emp  values (7369 , 'SMITH' , 'CLERK'    , 7902 , '1980-12-17' , 800 , null, 20);
insert into emp  values (7499 , 'ALLEN' , 'SALESMAN' , 7698 , '1981-02-20' , 1600 , 300, 30);
insert into emp values (  7521 , 'WARD' ,  'SALESMAN',     7698, '1981-02-22',       1250   ,     500 , 30);
insert into emp values (  7566 , 'JONES','MANAGER',         7839 ,'1981-04-02',              2975,    null,20);
insert into emp values (  7654 , 'MARTIN','SALESMAN',        7698 ,'1981-09-28',              1250,    1400,30);
insert into emp values (  7698  , 'BLAKE','MANAGER',         7839 ,'1981-05-01',              2850,    null,30);
insert into emp values (  7782  , 'CLARK','MANAGER',         7839 ,'1981-06-09',              2450,    null,10);
insert into emp values (  7788  , 'SCOTT','ANALYST',         7566 ,'1987-04-19',              3000,    null,20);
insert into emp values (  7839  , 'KING','PRESIDENT',       null ,'1981-11-17',              5000,    null,10);
insert into emp values (  7844  , 'TURNER','SALESMAN',        7698 ,'1981-09-08',              1500,       0, 30);
insert into emp values (  7876  , 'ADAMS','CLERK',           7788 ,'1987-05-23',              1100,    null, 20);
insert into emp values (  7900  , 'JAMES','CLERK',           7698 ,'1981-12-03',               950,    null, 30);
insert into emp values (  7902  , 'FORD','ANALYST',         7566 ,'1981-12-03',              3000,    null, 20);
insert into emp values (  7934  , 'MILLER','CLERK',           7782 ,'1982-01-23',              1300,    null, 10);
select * from emp;
 

/*
[002] 다음과 같이 데이터를 삽입하시오
mysql> select * from dept;
+--------+------------+----------+
| deptno | dname      | loc      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.00 sec)

mysql>
*/
 create table dept (
	deptno int not null  auto_increment primary key,
	dname varchar(20) not null,
	loc varchar(20) not null
);

insert into dept values (10 , 'ACCOUNTING' , 'NEW YORK');
insert into dept values (20 , 'RESEARCH' , 'DALLAS');
insert into dept values (30 , 'SALES' , 'CHICAGO');
insert into dept values (40 , 'OPERATIONS' , 'BOSTON');
select * from dept;


/*
[003] 다음과 같이 데이터를 삽입하시오
mysql>
mysql> select * from salgrade;
+-------+-------+-------+
| grade | losal | hisal |
+-------+-------+-------+
|     1 |   700 |  1200 |
|     2 |  1201 |  1400 |
|     3 |  1401 |  2000 |
|     4 |  2001 |  3000 |
|     5 |  3001 |  9999 |
+-------+-------+-------+
5 rows in set (0.00 sec)
*/

create table salgrade ( grade int not null  auto_increment primary key, losal int, hisal int);

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);

select * from salgrade;



#   조작어  DML - insert, select, update, delete  -   crud 
#   조작어  DML - insert, select, update, delete  -   crud 
#실습2) update
/*	 update  테이블명
	 set     필드1 = 값1, 필드2=값2
     where   조건
*/

-- 데이터 준비
desc userinfo;
insert  into userinfo   (name, age)  values ('fourth' , 44);
select * from userinfo;

#2-1. 전체데이터 수정
set     sql_safe_updates=0;   -- error code 1175

update  userinfo  set  age=0  ;
select  * from userinfo;

#2-2. 바꿀데이터 여러개
update  userinfo  set     age=11  where   no=1;
update  userinfo  set     age=22 , name='two'  where no=2; 
update  userinfo  set     name='second'    where no=2  and  age=22;

#- no가 3이고 age가 10인  유저의 이름을 'third' , 나이를 33살로 수정합니다.
#- no가 4이고 name 'first'인  유저의 이름을 'fourth' , 나이를 44살로 수정합니다. 
update  userinfo    set   name='third' , age=33  where age=10; -- 조건이 안맞으면 반영X
update  userinfo    set   age=33  where name='third';  
update  userinfo    set   age=44  where name='fourth';

select * from userinfo;


# 2-3 연습문제
desc score;
insert   into  score ( sname, sjava, sjsp, sspring,sproject)  values ('aaa',100,100,100,100);
insert   into  score ( sname, sjava, sjsp, sspring,sproject)  values ('bbb',90,98,88,100);
insert   into  score ( sname, sjava, sjsp, sspring,sproject)  values ('ccc',70,20,78,80);
insert   into  score ( sname, sjava, sjsp, sspring,sproject)  values ('ddd',78,89,68,98);
insert   into  score ( sname, sjava, sjsp, sspring,sproject)  values ('abc',89,98,67,77);
select * from score;

#[001]  이름이 ccc인 사람의 sjava=90 , sjsp=90, sspring=90으로 수정하시오
update  score   
set     sjava=90 , sjsp=90, sspring=90
where   sname='ccc';

select * from score;

#[002]  모든학생의 semail의 값을 admin@gmail.com으로 수정하시오
set     sql_safe_updates=0;  
update  score   set     semail = 'admin@gmail.com';

select  * from score;

#[003]  성적의 총합(sstotal)을 계산해서 넣기   sjava+sjsp+sspring+sproject
update  score   set     sstotal = sjava+sjsp+sspring+sproject;

select * from score;

#[004]  성적의 평균을 계산해서 넣기 , ssavg = sstotal/4   -  자료형 double 로 바꾸기 
alter  table   score   modify  ssavg  double ;    #    자료형 double 로 바꾸기 
update  score  set  ssavg = sstotal/4;            #    나누기처리

desc score;
select * from score;

#[005]  성적의 평균이 ssavg 100점인 학생의 email을 first@gmail.com으로 수정하시오
update  score   set  semail='first@gmail.com'   where  ssavg=100;

select * from score;

#[006]  이름이 bbb인 학생의 sjava 점수를 92 , sjsp점수를 78로 , 총점, 평균을  수정하시오
update score  
set    sjava=92 , sjsp=78 , sstotal=sjava+sjsp+sspring + sproject, ssavg=sstotal/4
where  sname='bbb';

select * from score;

#[007]  성적의 평균이 ssavg 89.5점인 학생의 semail을 second@gmail.com로 , sname을 second로 수정하시오
update  score
set     semail='second@gmail.com'  , sname='second'  where  ssavg= 89.5;

select * from score;

#[008]  sname이 ccc인 학생의 semail을  ccc@gmail.com으로 수정하시오
update  score   set  semail ='ccc@gmail.com'  where sname='ccc';


#[009]  sproject점수가 80점미만인 학생의 semail을 blackstdudent@gmail.com으로 수정하시오
update  score  set  semail ='blackstdudent@gmail.com'  where sproject < 80;

#[010]  ssavg이89.5이고 sproject가 98인 학생의 semail을  hello@gmail.com으로 수정하시오   
-- 조건식 맞는데이터가 없으면  수정이 안됨!
update  score   set  semail = 'hello@gmail.com'  where  ssavg=89.5  and sproject=98;



#   조작어  DML - insert, select, update, delete  -   crud 
#   조작어  DML - insert, select, update, delete  -   crud 
#실습3) delete
/*
	delete  from  테이블명
    where   조건식
*/


-- 준비  구조 + 데이터복사
create table userinfo_delete  select * from userinfo;
alter  table userinfo_delete  add  primary key(no);
alter  table userinfo_delete  modify no int not null  auto_increment;

desc userinfo_delete;
select * from userinfo_delete;

#3-1  age가 11인 유저 삭제
delete   from userinfo_delete  where age=11;
select * from userinfo_delete;  # ctrl + enter

# 이름이 second이고 나이가 22살인 유저
delete  from userinfo_delete   where  name='second'  and  age=22;

# 전체데이터삭제
delete from userinfo_delete;


#3-2 연습문제

-- emp 테이블을 구조+데이터복사해서 emp_del 준비
create table emp_del  select * from emp;
alter  table emp_del  modify empno int not null auto_increment primary key;
desc emp_del;
select * from emp_del;

#[001] [TABLE : delete_emp] (직책(JOB)이  'SALESMAN'인 데이터를 삭제하시오.  ) 
delete   from emp_del  where job='SALESMAN'; 
#[002] [TABLE : delete_emp] (직책(JOB)이  'MANAGER'이고  이름(ENAME)이 'JONES'인 데이터를 삭제하시오.  ) 
delete   from emp_del  where job='MANAGER'  and ename='jones';
#[003] [TABLE : delete_emp] (delete_emp 테이블의 모든 데이터를 삭제하시오. ) 
delete   from emp_del;









