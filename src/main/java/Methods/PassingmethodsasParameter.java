package Methods;

public class PassingmethodsasParameter {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		
		Update(A);
		System.out.println(A[0]);
		 
		for(int i=0;i<A.length;i++) {
		System.out.print(A[i]);

	}}
	static void Update( int A[]) { //We are not returning anything so Void is there.
		
		A[0]=10;
	}

}
