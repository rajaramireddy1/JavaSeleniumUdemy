package InterviewQuestions;

public class ReverseTheNumber {

	public static void main(String[] args) {
		 int originalNumber= 123456;
		 int revsedNumber= 0;
		 
		 while(originalNumber!=0) {
			 
			 int  num= originalNumber % 10;
			 revsedNumber=revsedNumber*10 + num;
			 originalNumber= originalNumber%10;
		 }
		 System.out.println(revsedNumber);

	}

}
