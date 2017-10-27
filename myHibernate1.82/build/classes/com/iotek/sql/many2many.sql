create table t_engineer(
	id number(10) primary key,
	name varchar2(20) not null,
	gender varchar2(10),
	age number(3) check(age between 1 and 100),
	company varchar2(20) not null
);
create table t_technology(
	id number(10) primary key,
	name varchar2(20) not null,
	category varchar2(20) not null
);
create table t_engineer_technology(
	engineer_id number(10),
	technology_id number(10),
	primary key(engineer_id,technology_id),
	foreign key(engineer_id) references t_engineer(id),
	foreign key(technology_id) references t_technology(id)
);
create sequence t_engineer_seq
	start with 1
	increment by 1
;
create sequence t_technology_seq
	start with 1
	increment by 1
;