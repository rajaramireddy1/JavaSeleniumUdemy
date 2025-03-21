package Arrays_Basics;

import java.util.LinkedHashSet;
import java.util.Set;

public class Arrays_DelDupIntegers {

	public static void main(String[] args) {
		int[] A = {1,2,2,3,3,4};
		
		Set<Integer> unique = new LinkedHashSet<>();
		
		for(Integer num : A) {
			unique.add(num);
		}
		System.out.println(unique);
	}

}
