package programs;

enum Languages {
	C, CPP, JAVA, PYTHON
};

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Languages lang;

		lang = Languages.JAVA;
		if (lang == Languages.JAVA)
			System.out.println("Next is Java EE");

		System.out.println("Value of lang = " + lang);

		switch (lang) {
		case C:
			System.out.println("C");
			break;
		case CPP:
			System.out.println("CPP");
			break;
		case JAVA:
			System.out.println("JAVA");
			break;
		case PYTHON:
			System.out.println("PYTHON");
			break;
		}
	}

}
