package com.albert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;


public class JDBCDemo
{
	

	public static void main(String[] args) throws Exception
	
	{
		
		String url="jdbc:mysql://localhost/alvy";
		String uname="root";
		String pass="albert";
		String query="select sname from student where rollno=3";
			DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		
		
		
	    Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("sname");
		System.out.println(name);
		st.close();
		con.close();
				
		
	}

}
