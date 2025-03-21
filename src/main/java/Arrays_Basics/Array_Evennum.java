package Arrays_Basics;
import java.util.Arrays;

public class Array_Evennum {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5,12,9,6,8};
		

		//Arrays.sort(arr);
		 

		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]+ ",");
			 

			}
			else {
				System.out.println(arr[i]+"  Not mul of 2");
			}
		}



	}

}
