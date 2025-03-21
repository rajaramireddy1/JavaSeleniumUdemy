package Methods;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(max(50,56));
		System.out.println(max(2.0f, 30.0f));

	}
	
	static int max(int x, int y) {
		
		return x>y? x:y;
	}
	static float max(float x, float y) {
		
		return x>y?x:y;
	}

}
