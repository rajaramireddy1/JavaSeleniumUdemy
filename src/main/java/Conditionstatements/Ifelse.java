package Conditionstatements;
public class Ifelse {
	
	public static void main(String args[]) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] %2==0) {       //only 2 divided values noted
				System.out.println(arr[i]+" Multiple of two" );
				
				break; // Once 2 multiple value will come it will break the loop
			}
			
			else
			{
				System.out.println(arr[i]+" It is not multiple of two");
			}
		}
		
	}

}
