package InterviewQuestions;

import java.util.Arrays;

public class Array_minAndmax {

	public static void main(String[] args) {

		int A[]= {1,4,2,4,6,6,5};
 
			
			for(int y:A) {
				Arrays.sort(A);
				System.out.println(y);
			}
			int max =A[A.length-1];
			int max2=A[A.length-2];
			//this code not works for similar elements at max
			System.out.println(max + " : Max1   "+ max2 + " :max2" ); 
			 
		}
 

	}
	

 