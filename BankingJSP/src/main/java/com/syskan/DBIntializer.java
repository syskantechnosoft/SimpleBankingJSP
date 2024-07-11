package com.syskan;

public interface DBIntializer {
	// Oracle DB configuration
//	String DRIVER = "oracle.jdbc.driver.OracleDriver";
//	String CON_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
//	String USERNAME = "system";
//	String PASSWORD = "oracle";

	// MySQL DB Configuration
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CON_STRING = "jdbc:mysql://localhost:3306/syskan";
	String USERNAME = "root";
	String PASSWORD = "root";
}
