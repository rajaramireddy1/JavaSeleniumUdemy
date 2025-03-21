package Arrays_Basics;

public class String_Character {

	public static void main(String[] args) {
		
		String str= "Raja ramireddy";
		str.replace("\\s", "");
		
		for(int i=str.length()-1;  i>=0;i--) {
			
			System.out.print(str.charAt(i));
			
		}
		System.out.println(" ");
		System.out.println(str.charAt(4));
   

	}

}
