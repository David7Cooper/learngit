package com.oaec.cooper.common;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ���������ķ�װ
 * @author Mary
 *
 */
public interface ResultSetHandler {
	public void handleRS(ResultSet rs)
			throws SQLException;
}
