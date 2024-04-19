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