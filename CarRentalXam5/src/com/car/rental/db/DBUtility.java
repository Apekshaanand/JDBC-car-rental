package com.car.rental.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.car.rental.domain.Customer;

public class DBUtility {

	private static Connection con;
	private static Connection con1;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Apeksha@123");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public PreparedStatement createPST(String sql) throws SQLException {
		
		return con.prepareStatement(sql);
			
	}

	public int update(PreparedStatement pst) throws SQLException {
		return pst.executeUpdate();
	}

	public ResultSet query(PreparedStatement pst) throws SQLException
	{
		return pst.executeQuery();
	}

	public boolean testCon() {
		if (con != null) {
			return true;
		} else
			return false;
	}


}
