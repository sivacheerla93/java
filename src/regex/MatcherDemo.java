package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[a-z]+");
		Matcher m = p.matcher("123bbc4343pqr3433");
		while (m.find()) {
			System.out.println("start(): " + m.start());
			System.out.println("ends(): " + m.end());
			System.out.println("group(): " + m.group());
		}

		// Pattern replacement
		p = Pattern.compile("-+");
		m = p.matcher("----12345----");
		String output = m.replaceAll("*");
		System.out.println(output);
	}

}
