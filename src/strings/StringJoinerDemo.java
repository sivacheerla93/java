package strings;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.add("Java");
		sj.add(" C#");
		sj.add(" Python");
		System.out.println(sj.toString());
	}

}
