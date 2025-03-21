package JavaOOPS;


class circleArea {
	
	public double radius;
	
	public double Area() {
		return Math.PI*radius*radius;
	}
	
	public double Permeter() {
		return 2*Math.PI*radius;
	}
	
	public double Circumfrence() {
		return Permeter();
		
	}
	
	
}

public class Circle {

	public static void main(String[] args) {
		
		
		circleArea C = new circleArea(); //Above class
		
		C.radius = 10;
		
		System.out.println("Area of Circle: "+ C.Area());
		System.out.println("Perimeter of Circle: "+ C.Permeter());
		System.out.println("Circumference of Circle: "+ C.Circumfrence());
		}

}
