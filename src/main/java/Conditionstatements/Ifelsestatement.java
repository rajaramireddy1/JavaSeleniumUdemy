package Conditionstatements;

import java.util.Scanner;

public class Ifelsestatement {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);   //input scanner object
		System.out.println("Please enter the number : ");

		int Num = input.nextInt();
		if(Num %2==0 ) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		input.close();
		
		
		
	}
	

}
