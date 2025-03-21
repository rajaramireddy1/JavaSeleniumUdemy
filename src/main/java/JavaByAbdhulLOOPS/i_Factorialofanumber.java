package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i_Factorialofanumber {

	public static void main(String[] args) {


		int num = 1;

		System.out.println("Enter Value : ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();

		for( int i=1;i<=n;i++) {

			num = num * i;

		}
		System.out.println("Factorial of "+ n +" is " + num);


	}

}
