package Interview;

public class SimilarCharracterInString {

	public static void main(String[] args) {
		String str1="practice";
		String str2="learning";
		int count=0;
		
		for(int i=0;i<str1.replace("\\s", "").length();i++) {
			for(int j=0;j<str2.replace("\\s", "").length();j++) {
				
			if(str1.charAt(i)==str2.charAt(j) ){
				count++;
				System.out.print(str1.charAt(i));
				
				
			}
			
				
			}
		}
	}

}
