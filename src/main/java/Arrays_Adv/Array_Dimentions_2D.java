package Arrays_Adv;

public class Array_Dimentions_2D {

	public static void main(String[] args) {
		
		int A[][]= new int[5][5]; //5/5 array declaration
		
		int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
		
		for(int i=0;i<B.length;i++) {
			
			for(int j=0;j<B.length;j++) {
				
				System.out.print(B[i][j]+ " ");
			}
			System.out.println("");
		}

	}

}
