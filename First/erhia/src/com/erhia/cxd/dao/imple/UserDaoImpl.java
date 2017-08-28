package com.erhia.cxd.dao.imple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.erhia.cxd.bean.User;
import com.erhia.cxd.dao.IUserDao;
import com.erhia.cxd.util.CurrName;
import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.PreparedStatementSetter;
import com.erhia.cxd.util.ResultSetHandler;

public class UserDaoImpl implements IUserDao{
	/**
	 * 必须，如果写在queryUser方法里就要加final
	 * 只要queryUser方法执行一次，user里就有值，并且生命周期与对象相同
	 */
	private User user;
	/**
	 * 用户名
	 * @param user
	 * @return
	 */
	@Override
	public User queryUser(final User user1) {
		// TODO Auto-generated method stub
		user = null;
		String sql = "select * from t_user where username=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setString(1, user1.getUserName());
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				if(rs.next()){
					user = new User(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3), 
							rs.getInt(4), 
							rs.getString(5), 
							rs.getString(6), 
							rs.getString(7), 
							rs.getInt(8)
					);
				}
			}
		});
		/**
		 * 可以优化
		 * new CurrName();
		 */
		if(user != null){
			/*CurrName df = new CurrName();
			df.setName(user.getUserName());
			df.setId(user.getId());*/
			CurrName.setId(user.getId());
			CurrName.setName(user.getUserName());
		}
		return user;
	}
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@Override
	public int addUser(final User user) {
		// TODO Auto-generated method stub
		String sql = "insert into t_user values("
				+ "t_user_id_seq.nextval,"
				+ "?,?,?,?,?,?,0)";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getPassword());
				pstmt.setInt(3, user.getSex());
				pstmt.setString(4, user.getIdNumber());
				pstmt.setString(5, user.getTel());
				pstmt.setString(6, user.getAddr());
			}
		});
		return n;
	}
	/**
	 * End
	 */
}
