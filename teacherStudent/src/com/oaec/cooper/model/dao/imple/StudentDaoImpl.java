package com.oaec.cooper.model.dao.imple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oaec.cooper.common.JDBCTemplate;
import com.oaec.cooper.common.PreparedStatementSetter;
import com.oaec.cooper.common.ResultSetHandler;
import com.oaec.cooper.model.bean.Student;
import com.oaec.cooper.model.bean.Teacher;
import com.oaec.cooper.model.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {
	private List<Student> list;
	private Teacher teacher;
	/**
	 * 增
	 * @return
	 */
	@Override
	public int AddStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student(name,age,sex,teacher_id) values(?,?,?,?)";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setString(1, student.getName());
				pstmt.setInt(2,student.getAge());
				pstmt.setString(3, student.getSex());
				pstmt.setInt(4, student.getTeacherId());
			}
		});
		return n;
	}
	/**
	 * 删
	 * @return
	 */
	@Override
	public int removeStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id=?";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, id);
			}
		});
		return n;
	}
	/**
	 * 改
	 * @return
	 */
	@Override
	public int updateStudent() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 查（查询所用）
	 * @return
	 */
	@Override
	public List<Student> queryAllStudent() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		String sql = "select * from student";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()) {
					list.add(new Student(
							rs.getInt(1),
							rs.getString(2),
							rs.getInt(3),
							rs.getString(4),
							rs.getInt(5),							
							queryByTeacherId(rs.getInt(5))
							));
				}
			}
		});
		return list;
	}
	/**
	 * 外键teacherId的内调函数
	 * @param teacherId
	 * @return
	 */
	public Teacher queryByTeacherId(int teacherId) {
		teacher = null;
		String sql = "select * from teacher where id=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1,teacherId);
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
