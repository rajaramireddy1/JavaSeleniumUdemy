package JavaByAbdhulsir;

import java.util.Scanner;

public class switchCaseWebsitetype {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter website name");  //Ex www.google.com
		String website = scan.nextLine();

		String ext = website.substring(website.lastIndexOf(".")+1); //we dont need . so we have added one there
		
		 
		switch(ext) {

		case "com" : System.out.println("Commercial");
		break;
		
		case ("org"): System.out.println("Organization"); 	
		break;
		
		case ("net"): System.out.println("Network"); 	
		break;
		
		default : System.out.println("Invalid");

		}




	}

}
