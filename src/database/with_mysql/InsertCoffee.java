package database.with_mysql;

import java.sql.*;
import java.util.Scanner;

public class InsertCoffee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pantry", "root", "9866850403");
			ps = con.prepareStatement("insert into coffee values(?,'Cafetino',?)");
			Scanner scan = new Scanner(System.in);

			do {
				System.out.println("Coffee id:");
				int id = scan.nextInt();
				System.out.println("Sales:");
				int sales = scan.nextInt();

				ps.setInt(1, id);
				ps.setInt(2, sales);

				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				System.out.println("Do you want to continue: y/n");
				String s = scan.nextLine(); // Can be scan.next()
				if (s.equals("n")) {
					System.out.println("Bye! Bye!!");
					break;
				}
			} while (true);
			ps.close();
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}