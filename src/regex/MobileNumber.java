package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String mobile = s.nextLine();
		if (Pattern.matches("^\\d{10}$", mobile))
			System.out.println("Valid mobile number");
		else
			System.out.println("Invalid mobile number!");

	}

}
