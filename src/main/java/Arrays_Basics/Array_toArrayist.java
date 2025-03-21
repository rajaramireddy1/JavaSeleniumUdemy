package Arrays_Basics;
 

import java.util.Arrays;
import java.util.List;

public class Array_toArrayist {

	public static void main(String[] args) {

		String arr[]= {"Raja","Ramireddy","Java","Selenium"};

		List<String> ArrayList= Arrays.asList(arr);

		System.out.println(ArrayList.contains("Java")); 

		//we can able to use contain method for only Arraylist so we have converted Array to arraylist 
		// In Arraylist there is no fixed size for array, we can add values dynamically
		//We can not add values to the static array because size already fixed.
		
		

	}

}
