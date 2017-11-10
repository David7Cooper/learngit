【数据库常用命令】
mysql -u root -p;（进入mysql）
show databases;（查找服务器上当前存在什么数据库）
create database myorm;（创建数据库）
use myorm;（进入数据库）
show tables;（查看数据库下有哪些表）
describe myorm;（显示表结构）
source F:/orm.sql;（导入SQL文件）
【多表连接】
@1@
查询全部
select e.*,d.*,j.* /*select后面只能是查询出来最多的那个表，主表*/
from employee e,jobinfo j,department d 
where e.jobInfoId=j.id and j.departmentId=d.id and e.departmentId=d.id
第二种查询全部的方法
select *
from employee e,jobinfo j,department d
where e.jobInfoId=j.id and j.departmentId=d.id and e.departmentId=d.id
@2@
select * 
from Custom c,CustomInfo ci,ConsultRecord cr
where c.id=ci.customId and c.id=cr.customId
select * 
from Custom c,CustomInfo ci
where c.id=ci.customId
select * 
from Custom,CustomInfo,ConsultRecord
【分页】
<select id="getCustomByConditions" resultType="com.oracle.bean.Custom">
		select * from custom
		<where>
			(1=1)
			<if test="param1.name!=null">
				and name like #{param1.name}
			</if>
			<if test="param1.customStatu!=null">
				and customStatu=#{param1.customStatu}
			</if>
			<if test="param1.inviteName!=null">
				and inviteName like #{param1.inviteName}
			</if>
			<if test="param1.phoneNo!=null">
				and phoneNo like #{param1.phoneNo}
			</if>
			<if test="param1.createDate!=null">
				and createDate = #{param1.createDate}
			</if>
		</where>
		limit #{param2},#{param3}	
	</select>
java_04-张成昊 15:07:06
<select id="countCustomByConditions" parameterType="com.oracle.bean.Custom" resultType="java.lang.Integer">
		select count(*) from custom
		<where>
			(1=1)
			<if test="name!=null">
				and name like #{name}
			</if>
			<if test="customStatu!=null">
				and customStatu = #{customStatu}
			</if>
			<if test="inviteName!=null">
				and inviteName like #{inviteName}
			</if>
			<if test="phoneNo!=null">
				and phoneNo like #{phoneNo}
			</if>
			<if test="createDate!=null">
				and createDate = #{createDate}
			</if>
		</where>
	</select>



