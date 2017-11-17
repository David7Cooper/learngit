package com.oaec.cooper.model.dao.imple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oaec.cooper.common.JDBCTemplate;
import com.oaec.cooper.common.PreparedStatementSetter;
import com.oaec.cooper.common.ResultSetHandler;
import com.oaec.cooper.model.bean.Teacher;
import com.oaec.cooper.model.dao.ITeacherDao;

public class TeacherDaoImpl implements ITeacherDao {
	private List<Teacher> list;
	private Teacher teacher;
	/**
	 * 增
	 * @return
	 */
	@Override
	public int addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		String sql = "insert into teacher(name,age,sex) values(?,?,?)";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setString(1, teacher.getName());
				pstmt.setInt(2,teacher.getAge());
				pstmt.setString(3, teacher.getSex());
			}
		});
		return n;
	}
	/**
	 * 删
	 * @return
	 */
	@Override
	public int removeTeacher() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 改
	 * @return
	 */
	@Override
	public int updateTeacher() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 查
	 * @return
	 */
	@Override
	public List<Teacher> queryAllTeacher() {
		list = new ArrayList<>();
		return null;
	}
	/**
	 * 查（根据老师的名字查询）
	 * @param teacherName
	 * @return
	 */
	@Override
	public Teacher queryByTeacherName(String teacherName) {
		// TODO Auto-generated method stub
		teacher = null;
		String sql = "select * from teacher where name=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setString(1, teacherName);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					teacher = new Teacher(
							rs.getInt(1),
							rs.getString(2),
							rs.getInt(3),
							rs.getString(4)
							);
				}
			}
		});
		return teacher;
	}
	/**
	 * End
	 */
}
