package Vowels;

public class PrintVowels {

	public static void main(String[] args) {
		
		String name= "Rajaaaa ruuamireddy";
		char[] vowels= {'a','e','i','o','u'};
		int[] count = new int[9];
		for(int i=0; i<name.length();i++) {
			
		
			for(int j=0; j<vowels.length;j++) {
				if(name.charAt(i)==vowels[j]) {
				count[j]++;
		}
		}}
	
		for(int z=0;z<count.length;z++) {
			if(count[z] >0) {
				System.out.println(vowels[z]+"="+ count[z]);
			}
		}

	}}

