package InterviewQuestions;

import java.net.Socket;
import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {


		for(int i=1; i<=10; i++) {

			System.out.print (i+ " ");

		}

		int a;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter value");

		a= scan.nextInt();

		while(a<10)

		{
			System.out.println(a);

			a=a*2;


		}
	}

}
