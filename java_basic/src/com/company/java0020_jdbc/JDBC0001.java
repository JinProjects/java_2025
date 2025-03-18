package com.company.java0020_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC0001 {

	public static void main(String[] args) {
		//1) 드라이버로딩 com.회사명.프로젝트명.jdbc.Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) jdbc 연동
			Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/mbasic","root","1234");
			if(conn != null) {
				System.out.println("db연결성공!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
