package program30july;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sn.next();
		String rev = "";
		for (int i = str.length()- 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("===>>>" + rev);
		System.out.println("===>>>" + str);

		if (str.equals(rev))
		{
			System.out.println("palindrome");
		} else{
			System.out.println("it is not a palindrome");
		}

	}
}
