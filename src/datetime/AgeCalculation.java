package datetime;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date of birth [dd-mm-yyyy]: ");
		String dobstring = s.nextLine();
		String parts[] = dobstring.split("-");
		Calendar dob = Calendar.getInstance();
		dob.set(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]));
		Calendar cd = Calendar.getInstance();
		long ms = cd.getTimeInMillis() - dob.getTimeInMillis();
		long days = ms / (24 * 60 * 60 * 1000);
		System.out.printf("Age is: %d", days / 365);
	}

}
