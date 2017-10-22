create table student(
	id number(10) primary key,
	name varchar2(20) not null,
	address varchar2(30),
	gender varchar2(10),
	age number(3) check(age between 1 and 100)
);

create sequence student_seq
	start with 1
	increment  by 1;

*******************************************
create table t_person_fk(
	id number(10) primary key,
	name varchar2(20) not null,
	gender varchar2(10),
	age number(3) check(age between 1 and 100)
);
create table t_passport_fk(
	id number(10) primary key,
	bh varchar2(30) not null unique,
	person_id number(10) references t_person_fk(id) unique
);

create sequence t_person_fk_seq
	start with 1
	increment by 1
;
create sequence t_passport_fk_seq
	start with 1
	increment by 1
;