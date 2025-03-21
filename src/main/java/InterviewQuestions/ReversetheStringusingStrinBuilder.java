package InterviewQuestions;

public class ReversetheStringusingStrinBuilder {

	public static void main(String[] args) {
		String Original = "Hello world!";
		StringBuilder revsedString = new StringBuilder(Original).reverse();
		String result = revsedString.toString();
		System.out.println(result);

	}

}
