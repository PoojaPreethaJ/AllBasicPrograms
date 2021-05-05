package com.example.database;
import java.sql.*;

public class DataBaseExample {
	public static void main(String[] args) throws Exception{
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//get the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root123");
		
		//create the statement object
		Statement st = con.createStatement();
		
		//execute Query
		ResultSet rs = st.executeQuery("select * from tbl_emp");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
	}
	
	
}
