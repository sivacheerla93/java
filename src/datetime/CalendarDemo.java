package datetime;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance(); // get system date and time

		cal.add(Calendar.MONTH, 10);
		System.out.printf("Year: %d Month: %d Day: %d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.get(Calendar.DAY_OF_MONTH));
	}

}
