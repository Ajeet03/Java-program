package program30july;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args){
		System.out.println("enter the digit to get factorial");
		int i , fact =1; 
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		if(n<0)
		{
			System.out.println("the entered digit will non negative");
		}
		else{
			for(i=1 ; i<=n ; i++)
			fact = fact*i;
			
			System.out.println("factorial number of " +n+ " is "  +fact);
			
		}
	

}
}