package strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java Language");
		String s2 = "Java EE";

		// comparing strings
		if (s1.equals(s2)) {
			System.out.println("Equal!");
		} else {
			System.out.println("Not Equal!");
		}

		// length of a string
		System.out.println(s2.length());

		// finding character at given position
		System.out.println(s1.charAt(5));

		// checks whether the string starts with given string
		System.out.println(s1.startsWith("Java"));

		// checks whether the string ends with given string
		System.out.println(s2.endsWith("EE"));

		// finding index of given character
		System.out.println(s1.indexOf("v"));

		// finding index of given character starting from given position
		System.out.println(s1.indexOf("n", 5));

		// finding index of given character, checks from the reverse
		System.out.println(s2.lastIndexOf("J"));

		// get substring of string
		System.out.println(s1.substring(0, 4));

		// converting to upper case
		System.out.println(s2.toUpperCase());

		// splitting a string
		String words[] = s1.split(" ");
		for (String w : words) {
			System.out.println(w);
		}

		// join()
		String langs = String.join(",", "Java", "Python", "C#");
		System.out.println(langs);

		// example for displaying string in vertical order
		String s = "Siva Cheerla";
		String arr[] = s.split("");
		for (String chr : arr) {
			System.out.println(chr);
		}

		// example for presence of substring in another string
		String s3 = "Java Lang Java";
		String s4 = "Java EE";

		String s3words[] = s3.split(" ");
		String s4words[] = s4.split(" ");
		int count = 0;

		// Getting count of a substring of s4 in s3
		for (String words4 : s4words) {
			for (String words3 : s3words) {
				if (words4.equals(words3)) {
					count += 1;
				}
			}
		}
		System.out.println("\n" + count);
	}

}
