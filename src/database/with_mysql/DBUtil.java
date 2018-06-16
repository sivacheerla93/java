package database.with_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	// note: need to download mysql-connector jar file and put it in jre/lib/ext
	// folder
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // for mysql connector
														// 5.1, Class is
														// com.mysql.jdbc.Driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/python?useSSL=true", "root", "9866850403");
			PreparedStatement ps = con.prepareStatement("show tables");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnection();
	}

}
