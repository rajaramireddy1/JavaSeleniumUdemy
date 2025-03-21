package Vowels;

import java.util.Scanner;

public class OccuranceofVowelsandConsonents {

	public static void main(String[] args) {

		int vowels=0, cons=0, spaces=0, digits=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name :"); 
		String name=sc.nextLine();

		name=name.toLowerCase(); 
		for(int i=0;i<name.length();i++) {

			char c = name.charAt(i);

			if( c == 'a' || c == 'e' || c == 'i' || c ==  'o'|| c== 'u') {
				++vowels;
				
			}
			else if(c>='a' && c<='z') {
				++cons;  
			}
			else if(c>='0' && c<='9') {
				++digits;  
			}
			else if(c ==' ') {
				++spaces; 
			}


		}
		System.out.println(vowels);
		System.out.println(cons);
		System.out.println(spaces);
		System.out.println(digits);

	}

}
