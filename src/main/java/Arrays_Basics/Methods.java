package Arrays_Basics;

public class Methods {

	public static void main(String[] args) {
		
	 Methods m = new Methods();
	String str=  m.getData();
	
	Methods1 m1=new Methods1();
	String str1 = m1.getUserData();
	System.out.println(str);
	System.out.println(str1); //this data coming from methods1 class in this package

	}
	
	public String getData() {
		
		System.out.println("Hi");
		
		return "Raja";

		//return ; if this method returning  String value we have to String in the place of Void
		
	}

}
