package Management_System;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	static Connection conn;
	public static Connection db() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
		
	}
}
