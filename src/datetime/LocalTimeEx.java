package datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		System.out.println(now);

		LocalTime singtime = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singtime);
	}

}
