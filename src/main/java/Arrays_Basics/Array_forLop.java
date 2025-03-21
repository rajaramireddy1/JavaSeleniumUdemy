package Arrays_Basics;
import java.util.Arrays;

public class Array_forLop {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5,10,7,8,9};

		Arrays.sort(a); //Sorting


		for(int c=0 ;c<a.length;c++) {

			System.out.println( a[c] );


		}

		String name[]= { "Raja", "Ramireddy", "R"};

		for(int x=0;x<name.length;x++) {


			System.out.println(name[x]+",");

		}
		System.out.println(name[1]);
	}

}


// we can create array like this also
// int[] a = new int[2]
//a[0]=1;
//a[1]=2;


