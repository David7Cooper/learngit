package com.erhia.cxd.dao.imple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.erhia.cxd.bean.Brand;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.bean.Category;
import com.erhia.cxd.dao.ICarDao;
import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.PreparedStatementSetter;
import com.erhia.cxd.util.ResultSetHandler;

public class CarDaoImpl implements ICarDao{
//	List<Car> list =new ArrayList<>();/*会完成值的叠加*/
	List<Car> list = null;
	/**
	 * 查询全部
	 * @return
	 */
	@Override
	public List<Car> queryAll() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		String sql = "select * from t_car";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Car(
							rs.getInt(1),
//							rs.getInt(3),
							queryBrandByBrandId(rs.getInt(3)),
							rs.getString(7),
							rs.getString(4),
//							rs.getInt(6),
							queryCarByCategoryId(rs.getInt(6)),
							rs.getInt(9),
							rs.getInt(10),
							rs.getInt(11)));
				}
				/*String sqlbrand = "select * from t_brand";
				JDBCTemplate.query(sqlbrand, null, new ResultSetHandler() {
					
					@Override
					public void handleRS(ResultSet rs) throws SQLException {
						// TODO Auto-generated method stub
						list.add(new Car
								(new List<Brand>().add
										(new Brand(rs.getInt(1),rs.getString(2)))
								));
					}
				});*/
			}
		});
		return list;
	}
	@Override
	public Category queryCarByCategoryId(final int cid) {
		final Category category=new Category();
		String sql="select * from t_Category where id=?";
		JDBCTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, cid);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()) {
					category.setId(rs.getInt(1));
					category.setName(rs.getString(2));
				}
			}
		});
		return category;
	}
	@Override
	public Brand queryBrandByBrandId(final int bid) {
		final Brand brand=new Brand();
		String sql="select * from t_Brand where id=?";
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
					brand.setId(rs.getInt(1));
					brand.setName(rs.getString(2));
				}				
			}
		});
		return brand;
	}
	/**
	 * 按照价格降序排列
	 */
	@Override
	public List<Car> queryAllByDes() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		String sql = "select * from t_car order by rent desc";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Car(
							rs.getInt(1),
							queryBrandByBrandId(rs.getInt(3)),
							rs.getString(7),
							rs.getString(4),
							queryCarByCategoryId(rs.getInt(6)),
							rs.getInt(9),
							rs.getInt(10),
							rs.getInt(11)));
				}
			}
		});
		return list;
	}
	/**
	 * 升序
	 */
	@Override
	public List<Car> queryAllByAsc() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		String sql = "select * from t_car order by rent asc";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Car(
							rs.getInt(1),
							queryBrandByBrandId(rs.getInt(3)),
							rs.getString(7),
							rs.getString(4),
							queryCarByCategoryId(rs.getInt(6)),
							rs.getInt(9),
							rs.getInt(10),
							rs.getInt(11)));
				}
			}
		});
		return list;
	}
	/**
	 * 管理员
	 * 添加汽车
	 */
	@Override
	public int addCar(final Car car) {
		// TODO Auto-generated method stub
		String sql = "insert into t_car values(t_car_id_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub		
//				pstmt.setInt(1,9);//////////////////////////////////////////////
				pstmt.setString(1, car.getCarNumber());
				pstmt.setInt(2,car.getBrandId());
				pstmt.setString(3, car.getModel());
				pstmt.setString(4, car.getColor());
				pstmt.setInt(5,car.getCategoryId());
				pstmt.setString(6, car.getTComments());
				pstmt.setInt(7,car.getPrice());
				pstmt.setInt(8,car.getRent());
				pstmt.setInt(9,car.getStatus());
				pstmt.setInt(10,car.getUseable());
				
			}
		});
		return n;
	}
	/**
	 * 管理员
	 * 修改汽车
	 */
	@Override
	public int updateCar(final Car car) {
		// TODO Auto-generated method stub
		String sql = "update t_car set "
				+ "car_number=?,brand_id=?,model=?,color=?,"
				+ "category_id=?,t_comments=?,price=?,rent=?,"
				+ "status=?,useable=? "
				+ "where id=?";
		int n = JDBCTemplate.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub	
				pstmt.setInt(11,car.getId());
				pstmt.setString(1, car.getCarNumber());
				pstmt.setInt(2,car.getBrandId());
				pstmt.setString(3, car.getModel());
				pstmt.setString(4, car.getColor());
				pstmt.setInt(5,car.getCategoryId());
				pstmt.setString(6, car.getTComments());
				pstmt.setInt(7,car.getPrice());
				pstmt.setInt(8,car.getRent());
				pstmt.setInt(9,car.getStatus());
				pstmt.setInt(10,car.getUseable());
			}
		});
		return n;
	}
	/**
	 * End
	 */
}
