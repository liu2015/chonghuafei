package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dao {

	private String className="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/db_memo";
	private String user="root";
	private String password="liu1988226";

	
	protected Connection conn=null;
	protected PreparedStatement ps=null;
	protected ResultSet rs=null;
	
//  protected  Connection =null;
//  protected PreparedStatement=null;
//
//  protected ResultSet =null;

public Connection getconnection(){
	
	try {
		Class.forName(className);
		conn=DriverManager.getConnection(url, user, password);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return conn;
	
}
	
	
}
