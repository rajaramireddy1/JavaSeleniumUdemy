package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i1_ReversingNumber {

	public static void main(String[] args) {
		
		System.out.println(" enter a number to reverse : ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int r;
	    int rev = 0;
		while(n>0) {
			r=n%10; 
			rev=rev*10+r;
			n=n/10;
			
			System.out.print(rev+ ",");
		}
		System.out.println(" ");
		System.out.println(rev);

	}

}
