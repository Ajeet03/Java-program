package program30july;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[]args)
	{
		System.out.println("Enter the digit");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		if(n % 2 == 0)
		{
			System.out.println(" entered number is even");
		}
		else{
			System.out.println(" entered number is odd");
		}
		
	}

}
