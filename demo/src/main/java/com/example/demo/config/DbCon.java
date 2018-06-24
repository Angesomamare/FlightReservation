/*package com.example.demo.config;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DbProperties;

@Component
public class DbCon {
	private DbProperties db;
	
	@Autowired
	public DbCon(DbProperties db) {
		this.db=db;		
	}
	
	public DataSource getDataSource() throws SQLException{
		final SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass('oracle.jdbc.driver.OracleDriver');
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("HR");
		dataSource.setPassword("Hr2018");
		return dataSource;
	
}
}*/