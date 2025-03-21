package Arrays_Basics;
import java.util.ArrayList;

public class Array_ArrayList {

	public static void main(String[] args) {
		int arr[]= {1,12,45,56,53};

		ArrayList<String> a= new ArrayList<String>();
		a.add("Raja");
		a.add("Rami");
		a.add("Reddy");
		a.add("Selenium");
		a.remove(2);
		
		 
		String s = a.get(2);

		System.out.println(s);

		for(int i=0;i<a.size();i++) { //we have to use Size for ArrayList
			System.out.println(a.get(i));
		}
		System.out.println("**********");
		
		
		//Enchanced for Loop

		for( String val :a) {
			System.out.println(val);
		}
		
		System.out.println(a.contains("Selenium"));



	}

}
