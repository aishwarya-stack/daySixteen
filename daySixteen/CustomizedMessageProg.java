package daySixteen;

import java.util.Scanner;

public class CustomizedMessageProg {
	private static void check(String fname, String lname, String num) {
		if ((fname != null && lname != null) && (fname.matches("^[a-zA-Z]*$") && lname.matches("^[a-zA-Z]*$"))) {
			System.out
					.println("Hello " + fname + ", We've your Full Name as " + fname + " " + lname + " in our System.");
		}
		if (num.matches("\\d{10}")) {
			System.out.println("Your Contact Number is " + num
					+ "Please, let us know in case of any clarification Thank you BridgeLabz 10/10/2021. \"");
		} else {
			System.out.println("Number Didn't MAtch to the criteria");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Hello Aishwarya, We've your Full Name as Aishwarya kadam in our System Your Contact Number is 91-8605025507 Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ");

		System.out.println();
		System.out.println("ENter First Name");
		String fname = sc.next();
		System.out.println("Enter Last Name: ");
		String lname = sc.next();
		System.out.println("Enter Your Phone Number");
		String number = sc.next();

		check(fname, lname, number);
	}
}
