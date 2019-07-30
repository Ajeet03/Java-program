package program30july;

import java.util.Scanner;

public class Primeno {
	public static void main(String[]args){
		System.out.println(" enter the digit");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		for(int i = 1 ;i<n ; i++)
		{
			boolean isPrime = true;
			for (int j = 2 ; j< i ; j++)
			{
				if(i%j == 0 )
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i+ " ");
		}
	}

}
