package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i1_ArmstrongNumber {

	public static void main(String[] args) {

		int r;

		System.out.println("Enter a number to check armstrong or not");
		Scanner scan = new Scanner(System.in);

		// cubing the digits and it's equals to original number it's called armstromg number

		int num= scan.nextInt(); //153
		int sum = 0;
		int m=num; // if we storing num in m then only it's store the given input otherwise it's store zero

		while(num > 0) {

			r= num%10;

			num=num/10;
			sum = sum+r*r*r;

		}
		System.out.println(sum);
		System.out.println(m);

		if(sum == m) {

			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Number is not a armstrong number");


	}}

}
