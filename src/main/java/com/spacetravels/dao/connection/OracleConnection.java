package com.spacetravels.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class OracleConnection {
	
	static {
		new OracleDriver();
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:ginion/ginion@//localhost:1521/ORCLCDB.localdomain");
	}

}
