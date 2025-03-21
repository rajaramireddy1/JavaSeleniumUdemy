package Methods;

public class Array_Passing {

	public static void main(String[] args) {
		
		int A[]= {1,2,3,5,6};
		
		changeValue(A,3,7);
		for( int x:A)
		{
		System.out.print(x+ ",");
		}
	}
	
	static void changeValue(int A[],int index,int value) {
		
		A[index]=value;
	}

}
