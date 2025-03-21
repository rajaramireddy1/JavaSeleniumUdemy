package Arrays_Adv;

public class Array_Copying {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5,6};
		int B[]= {};

		for(int i=0;i<A.length;i++) {

			B[i]=A[i];


			for(int x:A) {
				System.out.print(x+ ",");
			}

		}
	}

}
