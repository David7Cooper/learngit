package com.erhia.cxd.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.erhia.cxd.bean.Category;
import com.erhia.cxd.dao.ICategoryDao;
import com.erhia.cxd.util.JDBCTemplate;
import com.erhia.cxd.util.ResultSetHandler;

public class CategoryDaoImpl implements ICategoryDao{
	List<Category> list = new ArrayList<>();
	/**
	 * 查询全部
	 * @return
	 */
	@Override
	public List<Category> queryAll() {
		// TODO Auto-generated method stub
		String sql = "select * from t_category";
		JDBCTemplate.query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handleRS(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				while(rs.next()){
					list.add(new Category(
							rs.getInt(1),
							rs.getString(2)
							));
				}
			}
		});
		return list;
	}

}
