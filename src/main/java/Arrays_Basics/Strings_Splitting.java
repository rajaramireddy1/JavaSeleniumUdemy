package Arrays_Basics;

public class Strings_Splitting {

	public static void main(String[] args) {
		String s = "Raja Ramireddy selenium";  //literal

		String s1= new String("Selenium Java");

		String[] splitted= s.split(" "); //String "s" spliting using white spaces
		//Above splitted string have 3 values it storing in the array.

		System.out.println(splitted[1]); //i am retriving value present in the index 1
        
		System.out.println("*****************");
		//Enhanced for loop
		for(String val :splitted) {
			System.out.println(val);

		}

	}

}
