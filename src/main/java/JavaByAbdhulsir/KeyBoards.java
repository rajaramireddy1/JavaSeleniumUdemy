package JavaByAbdhulsir;

import java.util.Scanner;

public class KeyBoards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// Scanner = class name
		//sc = Referance
		//Scanner(System.in) = Constructer 
		//System.in = keyboard to take input values
		
		//Adding int float double string values, I am just practicibng keyboards here.
		
		int a;
		float b;
		String c;
		String d;
		System.out.println("Enter below values");
		a= sc.nextInt();
		b=sc.nextFloat();
		c=sc.next(); //it takes only one word
		d=sc.nextLine();  //it prints the complete word
		 
		 
		
		System.out.println("Complete data is " + a  + " " + b +" " + c +" " +d);
		
		

	}

}
