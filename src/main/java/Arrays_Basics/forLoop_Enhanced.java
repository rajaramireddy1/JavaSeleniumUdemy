package Arrays_Basics;

public class forLoop_Enhanced {

	public static void main(String[] args) {
		String name[]= {"Raja","Ramireddy","Selenium"};
		
		for(int i=0;i<name.length;i++) {
			
			System.out.println(name[i]);
		}
		
		System.out.println("**********");
		//Enhanced  for loop
		
		for(String s : name) {
			System.out.println(s);
			
		}
		

	}

}
