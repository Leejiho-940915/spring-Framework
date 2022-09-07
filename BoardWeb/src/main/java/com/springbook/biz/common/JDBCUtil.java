package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	
	public static Connection getConnection() {
		try {
			System.out.println("oracle connection!");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@192.168.40.131:1521:orcl2", "board", "board");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}// end of getConnection
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			
			try {
				
				if (!stmt.isClosed()) stmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}// end of stmt
		
		if (conn != null) {
			
			try {
				
				if (!conn.isClosed()) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}// end of conn
	}// end of close

	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			
			try {
				
				if (!rs.isClosed()) rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}// end of rs
		
		if (stmt != null) {
			
			try {
				
				if (!stmt.isClosed()) stmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}// end of stmt
		
		if (conn != null) {
			
			try {
				
				if (!conn.isClosed()) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}// end of conn
	}// end of close
}
