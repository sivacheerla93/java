package wrapperclasses;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;

		// boxing
		Integer iobj = new Integer(x);
		System.out.println(iobj);

		// unboxing
		int y = iobj.intValue();
		System.out.println(y);
	}

}
