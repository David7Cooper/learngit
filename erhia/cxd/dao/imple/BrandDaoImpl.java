package com.erhia.cxd.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.erhia.cxd.bean.Brand;
import com.erhia.cxd.dao.IBrandDao;
import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.ResultSetHandler;

public class BrandDaoImpl implements IBrandDao{
	List<Brand> list = null;
	
	@Override
	public List<Brand> queryAll() {
		list = new ArrayList<>();
		String sql = "select * from t_brand";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Brand(/*方法中定义的类部类只能访问方法中的final常量*/
							rs.getInt(1),
							rs.getString(2)
							));
				}
			}
		
		});
		return list;
	}


}