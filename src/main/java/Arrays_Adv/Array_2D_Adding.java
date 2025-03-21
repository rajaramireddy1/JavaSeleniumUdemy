package Arrays_Adv;

public class Array_2D_Adding {

	public static void main(String[] args) {
		
		int A[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int B[][]= {{2,2,2},{2,2,2},{3,3,3}};
		int C[][] = new int[3][3];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++) {
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]+ " ");
			}
			System.out.println(" ");
			
			 
		}
		 
	

	}

}
