package StatusHandlinds;
import java.util.ArrayList;

public class Test1 {
	
	public void regular() {
		
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Abhijeeth");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		
		
		int count=0;
		for(int i=0; i<names.size();i++) {
			
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				
			}
			count++;
			
		}
		System.out.println(count);
		
		
	}

}
