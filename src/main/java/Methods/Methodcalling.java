package Methods;

public class Methodcalling {

	public static void main(String[] args) {
		int a=10,b=20,c;
		
		c=max(a,b);
		System.out.println(c);
	}
	
	static int  max(int x, int y) {
		
		if(x>y) 
			 return x;
		else
			return y;
			
		
		
	}

}
