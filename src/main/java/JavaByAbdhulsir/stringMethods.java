package JavaByAbdhulsir;

public class stringMethods {

	public static void main(String[] args) {

		//String str = "Java ProgRam "; //below str allocation is also correct
		
		String str = new String("Java Programming ");
		//str=str.toLower(); this str created in heap

		String strUpper= str.toUpperCase();
		System.out.println(strUpper);

		String strLower= str.toLowerCase();
		System.out.println(strLower);

		//trim removes blank places in the string
		String str2 = str.trim();
		System.out.println(str2);

		//SubString starts the store the values from given index
		String sub = str.substring(0,6);
		System.out.println(sub);

		//Substring Begining and ending index it excludes last index
		String sub1= str.substring(0, 4);
		System.out.println(sub1);	
		
		//Length of String
		
		int len = str.length();
		System.out.println(len);
		
		//Replace
		String replace = str.replace("Java", "Python");
		str= str.replace('J','j'); // this str is newly created one and it's is created in the heap.
		
		System.out.println(replace);
		System.out.println(str);

		
		

	}

}
