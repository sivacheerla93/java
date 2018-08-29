package wrapperclasses;

public class AutoboxingAutounboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;

		// prior to java 5.0

		// autoboxing
		Integer iobj = i;
		System.out.println(iobj);

		// autounboxing
		int y = iobj;
		System.out.println(y);
	}

}
