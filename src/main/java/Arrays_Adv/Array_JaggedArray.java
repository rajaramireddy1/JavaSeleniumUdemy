package Arrays_Adv;

public class Array_JaggedArray {

	public static void main(String[] args) {
		
		
		//Jagged arrays contains number of array elements in each row is different
		int A[][];
		
		A=new int[3][];
		
		A[0]=new int[5];
		A[1]=new int[3];
		A[2]=new int[8];
		
		for(int i=0;i<A.length;i++) {
			
			for(int j=0;j<A[i].length;j++) 
			{
				System.out.print(A[i][j]+ " ");
			}
			System.out.println(" ");
			
			
		}

	}

}
