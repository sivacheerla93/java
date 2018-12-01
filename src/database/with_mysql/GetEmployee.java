package database.with_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetEmployee {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mock", "root", "9866850403");
			PreparedStatement stmt = con
					.prepareStatement("select * from employee where fn = ? and ln = \"Cheerla\" and city = ?");
			stmt.setString(1, "Siva");
			stmt.setString(2, "Vizag");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
