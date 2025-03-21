package InterviewQuestions;

public class AdditionofAllDigitsinNumber {

	public static void main(String[] args) {
		int z= 101,temp, r=0, num=0;
		while(z!=0) {
			r=z%10;
			num=num+r;
			z=z/10;
			 
		}
		System.out.println(num);

	}

}
