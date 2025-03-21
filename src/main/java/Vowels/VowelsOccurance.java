package Vowels;

import java.util.ArrayList;

public class VowelsOccurance {

	public static void main(String[] args) {
		String str = "RAja Ramiaeiouuu";
		 str=str.toLowerCase();
		char[] ch = {'a','e','i','o','u'};
		int[] count = new int[13];
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<ch.length;j++) {
				if(str.charAt(i) == ch[j]) {
					count[j]++ ;
				}
			}
		}
		
		for(int z=0;z<count.length;z++) {
			if(count[z]>0) {
				System.out.println(ch[z]+ " = "+ count[z]);
				
			}
		}
	}

}
