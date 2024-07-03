package employee.curd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/employee_db"; 
	private static final String DATABASE_USER = "root";
	private static final String DATABASE_PASSWORD = "sg19cse118";
	
	
	public static Connection getConnection() {
		Connection con = null;
		System.out.println("it is connecting");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("driver is conntected");
			con = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
	public static void main(String[] args) {
		System.out.println(DBConnection.getConnection());
	}

}
