package Conditionstatements;
public class ArrayTypes {

	public static void main(String[] args) {
		 //String is an object it can be sequence of characters
		//Creating String using Literals
		String s3 = "Rahul shetty academy";
		String s1 = "Start Preparation";  //Shortcut
		
		// Creating string using new memory
		String   s2 = new String("welcome");
		
		
		String s5 ="Rahul preaparing java";
		
		String[] splitedString =s1.split("Preparation") ;
		
		 
		System.out.print(splitedString[0]);
		System.out.println(" ");
		
		for(int i=0;i<s5.length();i++) {
			
			System.out.println(s5.charAt(i));
			
			
		}
		
		
		
		
		

	}

}
