package JavaByAbdhulsir;

public class stringMethods2 {

	public static void main(String[] args) {
		String str = "rajaramireddy1@gmail.com";

		int str2 =str.indexOf("r", 3); //it's starts searching r from index 3 onwards
		System.out.println(str2);
		
		
		// Above string str is dividing into two parts
		
		int i =str.indexOf("@"); // it stores value before @.
		
		String username = str.substring(0, i); //it reads up to i value
		System.out.println(username);
		
		String password = str.substring(i+1, str.length());
		System.out.println(password);
		
		System.out.println(password.startsWith("g"));
	}
	   

}