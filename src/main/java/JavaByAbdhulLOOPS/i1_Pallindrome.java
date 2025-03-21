package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i1_Pallindrome {

	public static void main(String[] args) {
		System.out.println(" enter a number : ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int r;
		int rev = 0;
		int m=n;
		while(n>0) {
			r=n%10; 
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev + " "+ m);
		if(rev==m) {
		System.out.println("Pallindrome");
		}

		else {
		System.out.println("Not a pallindrome");

	}}

}
