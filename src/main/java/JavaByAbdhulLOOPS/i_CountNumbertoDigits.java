package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i_CountNumbertoDigits {

	public static void main(String[] args) {


		System.out.println("Enter a number : ");
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int count =0;

		while( num != 0) {

			num=num/10;
			count++;
			
		}
	System.out.println(count);

	}

}
