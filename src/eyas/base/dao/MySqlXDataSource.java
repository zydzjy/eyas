package eyas.base.dao;

import java.sql.SQLException;

import javax.sql.XADataSource;

import com.arjuna.ats.internal.jdbc.DynamicClass;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;

public class MySqlXDataSource implements DynamicClass {
	private com.mysql.jdbc.jdbc2.optional.MysqlXADataSource dataSource;
	
	@Override
	public XADataSource getDataSource(String dbName) throws SQLException {
		
		this.dataSource = new MysqlXADataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/eyas_test1?characterEncoding=utf8");
		dataSource.setUser("root");
		dataSource.setPassword("");

		return dataSource;
	}

}
