package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("Siva Cheerla");

		Predicate<String> p = (s) -> s.length() > 5;
		System.out.println(p.test("Java"));

		Function<Integer, String> f = (n) -> n.toString();
		System.out.println(f.apply(100));
	}

}
