package com.cts.DaoUtils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConst {
	
	public static final String Driver="com.mysql.jdbc.Driver";
	public static final String Url="jdbc:mysql://localhost:3306/test";
	public static final String Uname="root";
	public static final String pwsd="root";
	
	
	public static  Connection getConnection()
	{
		Connection con=null;
		try {
			
			Class.forName(Driver);
			con=DriverManager.getConnection(Url,Uname,pwsd);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}
