package JavaByAbdhulsir;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Add");
		System.out.println("Mul");
		System.out.println("div");
		System.out.println("equals");

		System.out.println("Enter x and y values");
		int x= scan.nextInt();
		int y= scan.nextInt();

		scan.nextLine(); // it's used to read the below line
		System.out.println("Select above options");
		String option= scan.nextLine();

		option=option.toUpperCase(); //to avoid naming conflicts

		switch(option) {

		case ("ADD") : System.out.println("Sum is  "+ (x + y));
		break;
		case ("MUL") : System.out.println("Sum is  "+ (x * y));
		break;
		case ("SUB") : System.out.println("Sum is  "+ (x - y));
		break;
		default : System.out.println("Invalid");
		}






	}

}
