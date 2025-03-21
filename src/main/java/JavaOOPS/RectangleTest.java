package JavaOOPS;

class Rectangle{
	public double length;
	public double bredth;
	
	
	public double Area() {
		return length*bredth;
	}
	public double Perimeter() {
		return 2*(length+bredth);
	}
	public boolean IsSquare() {
		if(length == bredth)
			return true;
			else return false;
		}
	}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle R = new Rectangle();
		
		R.length = 10.13;
		R.bredth = 19.01;
		
		System.out.println(R.Area());
		System.out.println(R.Perimeter());
		System.out.println(R.IsSquare());
	}

}

