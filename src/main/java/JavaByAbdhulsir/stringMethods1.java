package JavaByAbdhulsir;

public class stringMethods1 {

	public static void main(String[] args) {
		
		String str = "Mr. Abdhulsir Java";
		String str1= "www.udemy.co.in";
		
		// Statswith Checking the starting character
		System.out.println(str.startsWith("Mr")); //if we use small m it displays false of case sensitive
		
		// Below condition checks the Abdhul name from index 4 onwards
		System.out.println(str.startsWith("Abdhul", 4));
		
		//Endswith
		System.out.println(str.endsWith("Java"));
		
		//charAt finding the character at desired position.
		System.out.println(str.charAt(0));
		
		
		//String str1= "www.udemy.co.in";
		System.out.println(str1.indexOf("udemy"));
		
		//it checks for the value . stating index
		System.out.println(str1.indexOf("."));
		
		//finding the dot value after the 4th index
		System.out.println(str1.indexOf(".", 4)); //it moves right to left
		
		
		//finding the values from left to right 
		
		System.out.println(str1.lastIndexOf("."));
		
	
		
	 System.out.println("***************");	
		//For displaying all letters in a sring
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			 
		}
		 
		
		 
		
		 
		
		
		
		
	
	}

}
