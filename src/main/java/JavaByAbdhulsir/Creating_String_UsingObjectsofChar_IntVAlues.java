package JavaByAbdhulsir;

public class Creating_String_UsingObjectsofChar_IntVAlues {

	public static void main(String[] args) {
		 String str1= "Java";
		 System.out.println(str1); //Literal Java Stored in POOL because we didn't created any object
		 
		 String str2 = new String("JAVA"); //It's stored in heap,becs we have created a object.
		 System.out.println(str2);		//Using Object
		 
		 char c[]= {'j','a','v','a'};
		 String str3 = new String(c);
		 System.out.println(str3);
		 
		 byte b[]= {65, 66, 67,68};
		 String str4 = new String(b);
		 System.out.println(str4);
		
				 
		 

	}

}
