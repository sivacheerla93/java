package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java ");
		System.out.println(sb.append("EE"));
		System.out.println(sb.reverse());
		sb.reverse();
		System.out.println(sb.insert(0, "Oracle "));
		System.out.println(sb.delete(0, 7));
	}

}
