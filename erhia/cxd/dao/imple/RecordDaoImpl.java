package com.erhia.cxd.dao.imple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.bean.Record;
import com.erhia.cxd.bean.User;
import com.erhia.cxd.dao.IRecordDao;
import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.PreparedStatementSetter;
import com.erhia.cxd.util.ResultSetHandler;

public class RecordDaoImpl implements IRecordDao{
	private List<Record> list = null;
	/**
	 * 查询所有用户记录
	 * @return
	 */
	@Override
	public List<Record> queryAll() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		String sql = "select * from t_record";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Record(
							rs.getInt(1),
							queryBrandByUserId(rs.getInt(2)),
							queryBrandByCarId(rs.getInt(3)),
							rs.getDate(4),
							rs.getDate(5),
							rs.getInt(6)));
				}
			}
		});
		return list;
	}	
	public User queryBrandByUserId(final int bid) {
		final User user =new User();
		String sql="select * from t_user where id=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, bid);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				while(rs.next()){
					user.setId(rs.getInt(1));
					user.setUserName(rs.getString(2));
					user.setPassword(rs.getString(3));
					user.setSex(rs.getInt(4));
					user.setIdNumber(rs.getString(5));
					user.setTel(rs.getString(6));
					user.setAddr(rs.getString(7));
					user.setType(rs.getInt(8));
				}				
			}
		});
		return user;
	}
	public Car queryBrandByCarId(final int bid) {
		final Car car = new Car();
		String sql="select * from t_car where id=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, bid);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				while(rs.next()){
					car.setId(rs.getInt(1));
					car.setCarNumber(rs.getString(2));
					car.setBrandId(rs.getInt(3));
					car.setModel(rs.getString(4));
					car.setColor(rs.getString(5));
					car.setCategoryId(rs.getInt(6));
					car.setTComments(rs.getString(7));
					car.setPrice(rs.getInt(8));
					car.setRent(rs.getInt(9));
					car.setStatus(rs.getInt(10));
					car.setUseable(rs.getInt(11));
				}				
			}
		});
		return car;
	}
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 如果你的方法没有写到Interface里，那么你就不能通过(接口的实现类)调用
		 * 但(接口的实现类)里的方法，可以调用没有写入Interface里的方法和属性（封装）
		 */
		IRecordDao r =new RecordDaoImpl();
		r.queryAll();
	}
	/**
	 * 租车
	 */
	@Override
	public void addCarRecord(final int id,final int carId) {
		// TODO Auto-generated method stub
		String sql = "insert into t_record(id,user_id,car_id,start_date) values(t_record_id_seq.nextval,?,?,sysdate)";
		JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, id);
				pstmt.setInt(2, carId);
			}
		});
		String sql1 = "update t_car set status=1 where id=?";
		JDBCTemplate.update(sql1, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, carId);
			}
		});
	}
	/**
	 * 还车
	 */
	/*@Override
	public void addCarRecordBack(Record record) {
		// TODO Auto-generated method stub
		String sql = "update t_record set return_date=?,payment=? where id=?";
		JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
//				pstmt.setDate(1, x);
//				pstmt.setInt(2, x);
//				pstmt.setInt(3, x);
			}
		});
	}*/
	int i;
	@Override
	public void addCarRecordBack(final Record record) {
		// TODO Auto-generated method stub
		String sql="update t_record set return_date=sysdate where id=?";
		JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, record.getId());
//				pstmt.setInt(1, record.getCarId());
//				System.out.println(record.getCarId());
			}
		});
		String sql1="select round(return_date-start_date) from t_record where id=?";
		JDBCTemplate.query(sql1, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, record.getId());
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				if(rs.next()){
					i=rs.getInt(1)+1;
				}
				
			}
		});	
		String sql2="update t_record set payment=? where id=?";
		JDBCTemplate.update(sql2, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, i*record.getCar().getRent());
				pstmt.setInt(2, record.getId());
			}
		});
		String sql3 = "update t_car set status=0 where id=?";
		JDBCTemplate.update(sql3, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, record.getCarId());
			}
		});
	}
	/**
	 * End
	 */
}
