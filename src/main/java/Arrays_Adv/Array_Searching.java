package Arrays_Adv;

import java.util.Scanner;

public class Array_Searching {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value to search");
		int Value = scan.nextInt();
		
		int A[] = {1,2,15,16,13};
		
		for(int i=0;i<A.length;i++) {
			
			if( Value==A[i]) {
				System.out.println("Element found at : "+i);
				System.exit(0);
			}	 
		}
		System.out.println("No element forund");
		


	}

}
 