package database.with_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "siva1", "siva1");
			PreparedStatement ps = con.prepareStatement("select * from tab");
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
