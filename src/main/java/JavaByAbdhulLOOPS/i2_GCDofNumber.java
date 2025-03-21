package JavaByAbdhulLOOPS;

public class i2_GCDofNumber {
	
	public static int GCD(int m,int n) {
		while(m!=n) {
			if(m>n) m=m-n;
			else n=n-m;
		}
		
		return m; //if both values are equals return m or n
		
	}

	public static void main(String[] args) {

		System.out.println(GCD(40,20));

	}

}
