package program30july;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println(" entered number is");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int i;
		if (n == 1) {
			System.out.println(" not a prime number ");
		} else {
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println(n + " not  a prime number");
					break;
				}
				i++;
				if (n == i) {
					System.out.print(n + " is a  prime number");
				}
			}
		}

	}
}
