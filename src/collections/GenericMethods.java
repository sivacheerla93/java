package collections;

public class GenericMethods {

	public static <T> void print(T a[]) {
		for (T v : a)
			System.out.println(v);
	}

	public static <T extends Comparable<T>> boolean contains(T a[], T v) {
		for (T value : a)
			if (value.compareTo(v) == 0)
				return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Steve", "Joe", "Bob", "James" };
		print(names);
		System.out.println(contains(names, "Joe"));
	}

}
