package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class sumOf_N_number {

	public static void main(String[] args) {
		int sum = 0;
  
		System.out.println("Enter Value : ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for( int i=1;i<=n;i++) {
			
			 sum= sum + i;
			
		}
		 System.out.println(sum);
		 
		  
	}

}
