create table book(
	isbn varchar2(50) primary key,
	name varchar2(30) not null,
	author varchar(20) not null,
	price number(10,2)
);