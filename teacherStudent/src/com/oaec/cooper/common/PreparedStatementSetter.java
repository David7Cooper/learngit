package com.oaec.cooper.common;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ��������ռλ����ֵ��ͨ������
 * @author Mary
 *
 */
public interface PreparedStatementSetter {
	public void setValues(PreparedStatement pstmt)
			throws SQLException;
}
