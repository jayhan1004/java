/* 교수테이블 생성 */
create table professors(
    pcode char(3) not null,
    pname varchar(15) not null,
    dept varchar(30),
    hiredate date,
    title varchar(15),
    salary int default 0,
    primary key(pcode)
);

/* 학생테이블 생성 */
create table students(
    scode char(8) not null,
    sname varchar(15) not null,
    dept varchar(30),
    year int default 1,
    birthday date,
    advisor char(3),
    primary key(scode),
    foreign key(advisor) references professors(pcode) /* on delete cascade */
);

/* 강좌테이블 생성 */
create table courses(
    lcode char(4) not null,
    lname varchar(50) not null,
    hours int,
    room char(3),
    instructor char(3),
    capacity int default 0,
    persons int default 0,
    primary key(lcode), /* constraint child_pk foreign key(instructor) references professors(pcode) */
    foreign key(instructor) references professors(pcode)
);

/* 수강신청테이블 생성 */
create table enrollments(
    lcode char(4) not null,
    scode char(8) not null,
    edate date,
    grade int default 0,
    primary key(lcode, scode),
    foreign key(lcode) references courses(lcode),
    foreign key(scode) references students(scode)
);

/* 교수테이블 값 넣기 */
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('221','이병렬','전산','75/04/03','정교수',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('228','이재광','전산','91/09/19','부교수',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('311','강승일','전자','94/06/09','부교수',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('509','오문환','건축','92/10/14','조교수',2000000);

/* 학생테이블 값 넣기 */
insert into students(scode,sname,dept,year,birthday,advisor)
values('92414029','서연우','전산',3,'73/10/06','228');
insert into students(scode,sname,dept,year,birthday,advisor)
values('92414033','김창덕','전산',4,'73/10/26','221');
insert into students(scode,sname,dept,year,birthday,advisor)
values('92514009','이지행','전자',4,'73/11/16','311');
insert into students(scode,sname,dept,year,birthday,advisor)
values('92514023','김형명','전자',4,'73/08/29','311');
insert into students(scode,sname,dept,year,birthday,advisor)
values('92454018','이원구','건축',3,'74/09/30','509');
insert into students(scode,sname,dept,year,birthday,advisor)
values('95454003','이재영','건축',4,'76/02/06','509');
insert into students(scode,sname,dept,year,birthday,advisor)
values('95414058','박혜경','전산',4,'76/03/12','221');
insert into students(scode,sname,dept,year,birthday,advisor)
values('96414404','김수정','전산',3,'77/12/22','228');

/* 강좌테이블 값 넣기 */
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C301','파일처리론', 3 ,'506','221',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C401','데이터베이스',3,'414','221',80,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C421','알고리즘',3,'510','228',80,72);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C312','자료구조',2,'510','228',100,60);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('E221','논리회로',3,'304','311',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('A109','한국의건축문화',2,'101','509',120,36);

/* 수강신청테이블 값 넣기 */
insert into enrollments(lcode, scode, edate, grade) values('C401','92414033','98/03/02',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414033','98/03/02',80);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414033','98/03/02', 0);
insert into enrollments(lcode, scode, edate, grade) values('C401','95414058','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C312','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C421','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414029','98/03/03',0);
insert into enrollments(lcode, scode, edate, grade) values('C312','92414029','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('E221','92414029','98/03/03',75);
insert into enrollments(lcode, scode, edate, grade) values('A109','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514009','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('E221','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C401','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C421','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C312','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('E221','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('A109','95454003','98/03/05',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','95454003','98/03/05',83);
insert into enrollments(lcode, scode, edate, grade) values('E221','95454003','98/03/05',75);

select * from professors;
select * from students;
select * from courses;
select * from enrollments;

/* 행이 몇개인지 확인 */
select count(*) from enrollments;

/* 중복 제거하고 확인 - 자동 오름차순*/
select distinct(dept) from professors;

/*학생 테이블에서 '전산'이면서 '3'학년 학생들의 이름, 학번, 생년월일을 검색하시오. */
select sname, scode, birthday from students where dept='전산' and year=3;

/* 19930301 이전에 임용된 교수의 이름 학과*/
select pname, dept from professors where hiredate <= '1993-03-01';

/* 지도교수 번호가 221이 아닌 모든 학생 */
/* 같지않다 != or <>*/
select * from students where advisor != '221';

/* 수강신청에서 점수80이상 학생의 강좌번호 학생번호 성적*/
select lcode, scode, grade from enrollments where grade >=80;

/* 강좌테이블에서 강좌이름에 건축 포함하는 강좌번호, 강좌이름, 담당교수, 강의시간*/
select lcode, lname, instructor, hours
from courses
where lname like '%건축%';

/* 수강신청 테이블에서 1998년 3월 1일에서 3월3일 사이에 수강신청 한 강좌번호, 학생번호, 수강신청일을 검색하시오.*/
/* between A and B*/
select lcode, scode, edate
from enrollments
where edate between '1998-03-01' and '1998-03-03';

/*교수 테이블에서 직급이 '정교수' 이거나 '부교수'인 교수들의 교수번호, 교수명, 직급을 검색하시오.*/
/* A or B*/
/* in (A, B)*/
select pcode, pname, title
from professors
where title='정교수' or title='부교수';

/*'전산'과 학생들의 학번, 이름, 생년월일을 이름을 기준으로 오름차순, 생년월일을 기준으로 내림차순 정렬을 하시오.*/
select scode, sname, birthday
from students
where dept = '전산'
order by sname asc, birthday desc;

/*학생들의 학과, 학생이름, 지도교수이름을 검색하시오.*/
select s.dept, s.sname, p.pname
from students s, professors p;

/*강좌번호, 강좌명, 교수이름을 검색하시오.*/
select c.lcode, c.lname, p.pname
from courses c, professors p
where c.instructor = p.pcode;

/*학번, 학생이름, 학생들이 수강신청 한 강좌번호, 수강신청일을 검색하시오*/
select s.scode, s.sname, e.lcode, e.edate
from students s, enrollments e
where s.scode=e.scode;

/*학번, 학생들이 수강신청 한 강좌번호, 강좌명, 성적을 검색하시오.*/
select s.scode, c.lcode, c.lname, e.grade
from students s, courses c, enrollments e
where s.scode=e.scode and c.lcode=e.lcode;

/*'이병렬'과 교수가 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오*/
select p.pname, s.sname, s.year, s.birthday
from professors p, students s
where p.pcode=s.advisor and p.pname='이병렬';

/*'98/03/03'에 수강신청 한 학생들의 학번, 학생이름, 강좌번호를 검색하시오.*/
select edate, s.scode, sname, lcode
from students s, enrollments e
where s.scode=e.scode and edate<='98/03/03';

/*'전산'과 교수들이 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오.*/
select p.dept, sname, year, birthday
from students s, professors p
where advisor=pcode and p.dept='전산';

/*자료구조'를 강의하는 교수의 학과명, 교수 명을 검색하시오.*/
select lname, dept, pname
from professors, courses
where instructor=pcode and lname='자료구조';

/*'파일처리론'을 수강신청 한 학생들의 학번, 수강신청일, 점수를 검색하시오.*/
select c.lname, s.scode, e.edate, e.grade
from students s, courses c, enrollments e
where s.scode=e.scode and c.lcode=e.lcode and c.lname='파일처리론';

/*'자료구조' 과목을 수강신청 한 학생들의 학과, 학생이름, 성적을 검색하시오.*/
select c.lname, dept, sname, grade
from students s, courses c, enrollments e
where s.scode=e.scode and c.lcode=e.lcode and c.lname='자료구조';

/*'전자'과 학생들의 학번, 학생이름, 수강신청 한 강좌번호, 강좌 명, 성적을 검색하시오.*/
select s.dept, s.scode, s.sname, c.lcode, c.lname, e.grade
from students s, courses c, enrollments e
where s.scode=e.scode and c.lcode=e.lcode and s.dept='전자';

/*'파일처리론'을 강의하는 교수의 이름, 이 교수가 지도하는 학생들의 학번, 학생명을 검색하시오.*/
select lname, pname, scode, sname
from professors p, students s, courses c
where pcode=instructor and pcode=advisor and lname='파일처리론';

/*'데이터베이스'를 강의하는 교수명, 이 과목을 수강신청 한 학생들의 학과, 이름, 성적을 검색하시오.*/
select lname, pname, s.dept, sname, grade
from professors p, students s, courses c, enrollments e
where pcode=instructor and pcode=advisor 
and s.scode=e.scode and c.lcode=e.lcode and lname='데이터베이스';

/*성적이 80점 이상인 학생들의 학번, 학생이름, 강좌번호, 강좌명, 담당교수 명을 검색하시오.*/
select grade, s.scode, s.sname, c.lcode, c.lname, p.pname
from professors p, students s, courses c, enrollments e
where pcode=instructor and pcode=advisor 
and s.scode=e.scode and c.lcode=e.lcode and grade>=80;

/*3.조회*/
/*3.교수들의 총 급여액과 평균 급여액을 구하시오.*/
select sum(salary) salary_sum, avg(salary) salary_avg, count(*) 
from professors;

/*전산과 교수들의 총 급여액과 평균 급여액을 구하시오.*/
select sum(salary) salary_sum, avg(salary) salary_avg
from professors
where dept='전산';

/*수강신청 한 과목들 중에서 최고 점수와 최저 점수를 구하시오.*/
select max(grade), min(grade)
from enrollments;

/*전산과 학생들은 모두 몇 명인지 구하시오.*/
select count(*)
from students
where dept='전산';

/*수강신청 한 학생들은 모두 몇 명인지 구하시오.*/
select count(distinct(scode))
from enrollments;

/*각 학과별 학생들의 수를 구하시오.*/
select dept, count(scode)
from students
group by dept
order by count(scode) desc;

/*교수들을 소속학과별, 직급별로 분류하여 각 직급별 평균 급여액수를 구하시오.*/
select dept, title, avg(salary), count(pcode)
from professors
group by dept, title
order by dept, title;

/*각 학생들에 대해 학번, 학생이름, 수강신청 과목들의 평균 점수를 구하시오.*/
/*group by 할때는 집계함수 외에 select에 적은거 다 들어가야함*/
select s.scode, dept, sname, avg(grade), count(lcode)
from students s, enrollments e
where s.scode=e.scode
group by s.scode, dept, sname
order by avg(grade) desc;

create view stu_cou_enr as
select e.*, s.sname, c.lname
from enrollments e, students s, courses c
where e.lcode=c.lcode and e.scode=s.scode;
select * from stu_cou_enr;

/*각 학생들에 대해 수강신청 과목들의 평균 점수를 구하시오.*/
select s.scode, avg(grade)
from students s, enrollments e
where s.scode=e.scode
group by s.scode;

/*수강신청 한 과목들을 학생별로 그룹핑하여 평균 점수를 구한 다음, 학생번호, 평균 점수를 성적이 높은 순으로 정렬하여 출력하시오.*/
select s.scode, avg(grade), count(*)
from students s, enrollments e
where s.scode=e.scode
group by s.scode
order by avg(grade) desc;

/*수강신청 과목들의 평균 점수가 85점 이상인 학생들의 학생번호, 평균 점수를 구하시오.*/
/*group한 데이터의 집계함수를 조건으로 넣는 경우 where 안에 조건 불가*/
/*group by 후에 having 으로 조건을 넣는다*/
select s.scode, avg(grade)
from students s, enrollments e
where s.scode=e.scode
group by s.scode having avg(grade)>=85;

/*강좌별 평균점수가 80점 이상인 강좌들의 강좌번호와 평균점수를 출력하시오.*/
select lcode, avg(grade)
from enrollments
group by lcode having avg(grade)>=80;

/*학생수가 3명 이상인 학과 구한 다음, 학과명, 학생수를 출력하시오.*/
select dept, count(*)
from students
group by dept having count(*)>=3;

/*수강신청 평균점수가 85점 이상인 학생들의 학생번호, 학생이름, 평균 점수를 평균점수가 높은 순으로 출력하시오.*/
select e.scode, sname, avg(grade)
from students s, enrollments e
where s.scode=e.scode
group by e.scode, sname having avg(grade)>=85
order by avg(grade) desc;

/*강좌별 평균점수가 80점 이상인 강좌들의 강좌번호, 강좌명, 평균점수를 평균점수가 높은 순으로 출력하시오.*/
select c.lcode, c.lname, avg(grade)
from courses c, enrollments e
where c.lcode=e.lcode
group by c.lcode, c.lname having avg(grade)>=80
order by avg(grade) desc;

/*4.조회*/
/*서브쿼리*/
/*select 불러올거 from 불러올거 테이블 where 불러올 외래키
in (select 조건 외래키 from 조건 테이블 where 조건)*/
/*'알고리즘'을 강의하는 교수의 교수번호, 교수이름, 소속학과를 검색하시오.*/
select pcode, pname, dept
from professors p, courses c
where p.pcode=c.instructor;

/*강의실 '510'호에서 강의하는 교수의 교수번호, 교수이름, 소속학과를 검색하시오.*/
select pcode, pname, dept
from professors
where pcode
in (select instructor from courses where room='510');

/*'김창덕' 학생이 소속된 학과에 재직하는 교수들의 이름, 직급, 임용일자를 검색하시오.*/
select pname, title, hiredate
from professors
where dept
in (select dept from students where sname='김창덕');

/*수강신청 과목의 평균점수가 80점 이상인 학생들의 이름, 학생번호, 소속학과, 학년을 검색하시오.*/
select sname, scode, dept, year
from students
where scode
in (select scode from enrollments group by scode having avg(grade)>=80);

/*'전산'과 교수들이 담당하는 강좌의 이름, 강의시간수, 강의실을 검색하시오.*/
/*'98/03/02'에 수강신청 한 학생들의 학과, 학번, 학생이름, 학년을 검색하시오.*/
/*'509'호에서 강의를 듣는 학생들의 학과, 학번, 학생이름을 검색하시오.*/
/*수강신청 과목의 평균점수가 80점 이상인 학생들의 이름, 학생번호, 소속학과, 학년을 검색하시오.*/
/*'건축'과 학생들을 지도하는 교수의 이름, 교수번호, 소속학과, 직급을 검색하시오.*/
/*학생수가 '3'명 이상인 학과에 근무하는 교수들의 이름, 소속학과, 직급을 검색하시오.*/
/*'이원구'가 수강신청한 과목의 번호, 과목명, 점수를 검색하시오.*/
/*'알고리즘'을 수강신청한 학생들의 학번, 학생이름, 학과를 검색하시오.*/
/*'1973'년생 학생들을 지도하는 교수들의 이름, 소속학과, 직급을 검색하시오.*/
/*전체 학생의 30% 이상이 수강신청한 강좌의 번호를 검색하시오.*/
select lcode from courses where lcode
in (select lcode from enrollments group by lcode
having count(scode)>=(select count(*)from students)*0.3 );

/*1.갱신*/
/*'98414022', '노진순', '75-05-10', '전산' 값을 학생테이블에 삽입하시오.*/
insert into students(scode, sname, birthday, dept)
values('98414022', '노진순', '75-05-10', '전산');
select * from students;

/*노진순의 수강신청 내용을 수강신청(Enrollments)테이블에 삽입하시오.*/
/*'1998년 1월 1일' 이전에 발생한 모든 수강신청 데이터를 oldEnrollments테이블로 복사하시오.*/
insert into oldEnrollments(lcode, scode, edate, grade)
select lcode, scode, edate, grade from enrollments where edate <= '98-01-01';

/*4학년 학생들의 모든 학생 데이터를 oldstudents 테이블로 복사하시오.*/
insert into oldstudents
select * from students where year=4;
/*학생테이블에서 '노진순'의 데이터를 삭제하시오.*/
/*'1998년 1월 1일' 이전에 신청한 모든 수강신청 데이터를 삭제하시오.*/
/*수강신청 한 과목에 대해 성적을 아직 받지 못한 수강신청 데이터를 삭제하시오.*/
/*수강신청 한 과목에 대해 성적을 아직 받지 못한 수강신청 데이터를 삭제하시오.*/
/*학생테이블에서 전산과 3학년 데이터를 4학년으로 변경하시오.*/
/*'오문환' 교수의 직급을 '조교수'에서 '부교수'로 변경하시오.*/
/*'건축과' 학생이 신청한 모든 수강신청 데이터를 삭제하시오.*/
/*'전산'과 교수들의 급여를 10% 증가 시키시오.*/
/*모든 교수들의 급여를 10% 증가 시키시오.*/
/*'전자'과 학생들이 신청한 수강신청 데이터를 모두 삭제하시오.*/
/*'전산'과 교수가 담당하는 강좌의 강의실을 모두 '123'호실로 변경하시오.*/

/*2.갱신*/
/*'이재광' 교수가 지도하는 학생들의 지도교수를 교수번호 '221'로 변경하시오.*/
update students set advisor='221' where advisor in
(select pcode from professors where pname='이재광');
/*'파일처리론' 과목을 수강신청 한 학생들의 점수를 5점씩 증가 시키시오. */
update enrollments set grade=grade+5 where lcode in
(select lcode from courses where lname='파일처리론');
/*'전자'과 학생들이 수강신청 한 수강신청 데이터의 점수를 0점 처리 하시오.*/
/*'서연우' 학생의 지도교수가 강의하는 강좌의 강의실을 '304'호로 변경하시오.*/
/*'논리회로'를 강의하는 교수의 급여를 100000원 인상하시오.*/
/*수강신청인원수가 80명 이상인 강좌를 강의하는 교수들의 급여를 100000원 인상하시오.*/
/*서연우' 학생의 모든 과목 점수를 5점씩 감소 시키시오.*/
/*'전산'과 3학년 학생들이 수강신청 한 과목들의 성적을 5점씩 증가 시키시오.*/
/*'전산'과 '부교수'가 강의하는 강의시간수를 1씩 증가 시키시오.*/
/*수강신청 한 과목이3과목 이상인 학생들의 학년을 1씩 증가 시키시오.*/
/*수강신청 평균점수가 80점 미만인 학생들의 학년을 1씩 감소시키시오.*/
/*'파일처리론'을 수강신청 한 학생들의 학과를 '건축'으로 수정하시오.*/
/*강좌별 평균점수가 80점 이상인 과목들의 강의실을 '509'호로 변경하시오.*/
/*'오문환' 교수가 강의하는 강좌를 신청한 수강신청 데이터를 삭제하시오.*/
/*'자료구조'를 수강신청 한 학생의 학년을 1씩 증가 시키시오.*/