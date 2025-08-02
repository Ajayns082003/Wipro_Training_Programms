package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Program1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc2";
		String userName="root";
		String pwd="root";
		String query="select * from students";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection(url,userName,pwd);
		Statement st = c.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next()) {
			int id =rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			
			System.out.println("Id: "+id+", Name:"+name+", Email:"+email);
			
		}
		st.close();
		c.close();
	}

}
