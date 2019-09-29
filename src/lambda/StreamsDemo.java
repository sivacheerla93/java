package lambda;

import java.util.ArrayList;
import java.util.Optional;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyTime> times = new ArrayList<MyTime>();
		times.add(new MyTime(20, 45, 55));
		times.add(new MyTime(10, 34, 30));
		times.add(new MyTime(14, 15, 20));
		times.add(new MyTime(7, 10, 50));
		times.stream().filter(t -> t.getHours() > 10).limit(2).forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------");
		
		double average = times.stream().mapToInt(MyTime::totalSeconds).average().getAsDouble();
		
		System.out.println(average);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Any Hours > 12 ? "+ times.stream().anyMatch(t -> t.getHours()>12));
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("All Hours > 12 ? "+times.stream().allMatch(t -> t.getHours() > 12));

		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Count = "+times.stream().count());

		System.out.println("--------------------------------------------------------------");
		
		/*Optional<MyTime> mintime = times.stream().min((t1, t2) - > t1.totalSeconds() - t2.totalSeconds());
		System.out.println("Minimum = "+mintime.get());*/
	}

}
