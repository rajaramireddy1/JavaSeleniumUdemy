package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class i2_PrimeNumber {

	 static  boolean isPrime(int num) {
		for(int i=2;i< num/2 ; i++) {
			if(num %i ==2)
				return false;
			}		
		return true;

	}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to check number is prime or not");
	int num= sc.nextInt();
	
	System.out.println(isPrime(num));
}
}
