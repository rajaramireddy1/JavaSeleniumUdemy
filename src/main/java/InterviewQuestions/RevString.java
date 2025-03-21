package InterviewQuestions;

import java.util.Scanner;
 
public class RevString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value : ");
		
		String str=scan.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}

	}

}
