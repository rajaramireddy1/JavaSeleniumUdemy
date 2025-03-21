package InterviewQuestions;

public class stringNoOfWords {

	public static void main(String[] args) {
		String str = "Raja224@#!15";
		
		String str1 = " ra   ja 45  ksjs";
		


		//remopving rSpecial characters using Regular expressions

		String str3 = str.replaceAll("[^a-z A-z 0-9]", "");
		System.out.println(str3 );


		//Removing  2 spaces from the above string and  maintaining only one space.
		String str2 = str1.replaceAll("\\s+", " ").trim();
		
		
		
		//   \\s+ remove the extra spaces in the string
		System.out.println(str2);
		
		
		//Finding Number of words there in a string
		
	    str1 = str1.replaceAll("\\s+", " ").trim();   //replacing all spaces with single space
		String[] words = str1.split("\\s"); // \\s used for spaces
		System.out.println(words.length);
		
		//4 words is there
	}

}
