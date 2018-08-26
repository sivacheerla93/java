package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1998, Month.OCTOBER, 24);
		LocalDate newdate = date.plusDays(100);
		System.out.println(newdate);

		LocalDate dob = LocalDate.parse("1998-02-28"); // ISO format
		System.out.println(dob);

		LocalDate dob2 = LocalDate.parse("09-10-2002", DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println(dob2);
	}

}
