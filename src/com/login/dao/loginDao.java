package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginDao {
	
	String sql="select * from login where uname=? and pass=?";
	
	String url="jdbc:mysql://localhost:3306/jdbc";
	
	String username="root";
	
	String password="root";

	public boolean check(String uname,String pass) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			return true;
		}
		
		
		
	return false;	
	}
}
