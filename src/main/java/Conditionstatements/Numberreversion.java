package Conditionstatements;

import java.util.Scanner;

public class Numberreversion {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the number : " );
		int n  = s.nextInt();
		 int rev=0;
		 
		 while(n != 0) {
			 rev=rev*10+(n%10);
			 
			 n= n/10;
			 
		 }
		 
		 
		 System.out.println("After reversing :"+rev);
		 
		
		
	
	}

}
