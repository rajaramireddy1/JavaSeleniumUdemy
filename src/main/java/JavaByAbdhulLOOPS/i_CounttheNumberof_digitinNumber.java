package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i_CounttheNumberof_digitinNumber {

	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int count=0;	

		while(num > 0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
