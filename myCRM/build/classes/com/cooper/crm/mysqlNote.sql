
mysql -u root -p;（进入mysql）
show databases;（查找服务器上当前存在什么数据库）
create database myorm;（创建数据库）
use myorm;（进入数据库）
show tables;（查看数据库下有哪些表）
describe myorm;（显示表结构）
source F:/orm.sql;（导入SQL文件）

select * 
from employee,jobinfo,department
where employee.jobInfoId=jobinfo.id && employee.departmentId=department.id;

