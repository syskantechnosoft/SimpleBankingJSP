package com.syskan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterUser {
	static int status = 0;

//int accountno=1;
	public static int register(String username, String password, String repassword, double amount, String adderess,
			double phone) {
		// public static int register(String email,String password,String gender,String
		// country,String name){

		Connection con = GetCon.getCon();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(
					"Insert into NEW_ACCOUNT (username,password,amount,address,phone) values(?,?,?,?,?)");
//			int nextvalue1 = GetCon.getPrimaryKey();
//			ps.setInt(1, nextvalue1);
			ps.setString(1, username);
			ps.setString(2, password);
//			ps.setString(4, repassword);
			ps.setDouble(3, amount);
			ps.setString(4, adderess);
			ps.setDouble(5, phone);

			status = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return status;

	}
}
