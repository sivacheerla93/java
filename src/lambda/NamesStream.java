package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

class PrintName implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t.toUpperCase());
	}

}

public class NamesStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Bill Gates");
		names.add("Steve Jobs");
		names.add("Larry Ellison");
		names.add("Larry Page");
		names.add("Musk");

		names.stream().forEach(new PrintName());

		// names.stream().forEach(s -> System.out.println(s));

		// names.stream().forEach(System.out::println);
	}

}
