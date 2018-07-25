package programs;

public class PrintArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("No arguaments!");
			return;
		}
		for (String s : args) {
			System.out.println(s);
		}
	}

}
