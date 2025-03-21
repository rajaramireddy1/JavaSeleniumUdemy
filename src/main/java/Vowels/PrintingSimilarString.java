package Vowels;

public class PrintingSimilarString {

	public static void main(String[] args) {
		String s1 = "    I Love Java 1  ";
		String s2 = "I love Python";
		
		String result = s1.trim();
		
		s2= s2.replaceAll("\\s", "* ").trim();
		
		System.out.println(s2);
		

	}

}
