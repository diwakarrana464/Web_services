package com.rana.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon {
	private static Connection con = null;
     static {
    	     try {
    	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
    	    	 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##rana", "rana123");

			} catch (Exception e) {
				e.printStackTrace();
			}
     }//end of static block.....
     
     public static  Connection  getConnection() {
    	 return con;
     }
}
