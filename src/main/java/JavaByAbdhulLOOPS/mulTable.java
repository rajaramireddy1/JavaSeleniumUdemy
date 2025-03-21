package JavaByAbdhulLOOPS;

import java.util.Scanner;

public class mulTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter value : ");
		int n = scan.nextInt();
		int i = 1;
		
		 
		
		while(i<=10) {
			
			//int mul=n*i;
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
			
			
		}
		
		System.out.println("Using For loop");
		for(int i1=1; i1<=10;i1++) {
			
			System.out.println(n + "*" + i1 + "=" + n*i1);
			
			
		}
		
		

	}

}
