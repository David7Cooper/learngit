package com.erhia.cxd.bean;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.PreparedStatementSetter;
import com.erhia.cxd.util.ResultSetHandler;

public class Record {
	private int id;
	private int userId;
	private int carId;
	private Date startDate;
	private Date returnDate;
	private int payment;
	private User user;
	private Car car;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	/**
	 * 构造器
	 */
	public Record() {
		super();
	}	
	public Record(int id, int userId, int carId, Date startDate,
			Date returnDate, int payment) {
		super();
		this.id = id;
		this.userId = userId;
		this.carId = carId;
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.payment = payment;
	}
	public Record(int id, final User user, final Car car, Date startDate,
			Date returnDate, int payment) {
		super();
		this.id = id;
		this.user = user;
		this.userId = user.getId();
		this.car = car;
		this.carId = car.getId();
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.payment = payment;
		String sql = "select * from t_brand where id=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1,car.getBrandId());
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				if(rs.next()){
					/*car.getBrand()=*/ 	
					car.setBrand(new Brand(
							rs.getInt(1),
							rs.getString(2)));
					
				}
			}
		});
		/*********************************/
		String sql1 = "select * from t_category where id=?";
		JDBCTemplate.query(sql1, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1,car.getCategoryId());
			}
		},new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				if(rs.next()){
					car.setCategory(new Category(
							rs.getInt(1),
							rs.getString(2)));
				}
			}
		});
		
	}
	public Record(int id, int userId, int carId, Date startDate,
			Date returnDate, int payment, User user, Car car) {
		super();
		this.id = id;
		this.userId = userId;
		this.carId = carId;
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.payment = payment;
		this.user = user;
		this.car = car;
	}
	
	@Override
	public String toString() {
		return id+"\t"+car.getId()+"\t"
				+car.getModel()+"\t"+car.getTComments()
				+"\t"+car.getBrand().getName()+"\t"
				+car.getCategory().getName()+"\t"
				+car.getPrice()+"\t"
				+car.getCarNumber()+"\t\t"
				+user.getUserName()+"\t\t"
				+this.getStartDate()+"\t"
				+this.getReturnDate()+"\t"
				+car.getRent()+"/天"+"\t"
				+this.payment;
	}
	/**
	 * End
	 */
}
