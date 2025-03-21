package JavaOOPS;

class Rectangle1{
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setLength(double l) {
		//length cannot be negative
		if(l>0)
		length = l;
		else
			length =0;
	}
	public void setBreadth(double b) {
		if(b>0)
			breadth = b;
			else
				breadth =0;
	}
	
	
	public double Area() {
		// return length*breadth; //we can use below method also
		
	return getLength()*getBreadth();
			}
	public double Perimeter() {
		return 2*(length+breadth);
	}
	public boolean IsSquare() {
		if(length == breadth)
			return true;
			else return false;
		}
	}

public class DataHideingRectangleTest {

	public static void main(String[] args) {
		
		Rectangle1 R = new Rectangle1();
		
		R.setLength(10.5);
		R.setBreadth(10.5);
		
		System.out.println(R.Area());
		System.out.println(R.Perimeter());
		System.out.println(R.IsSquare());
		
		System.out.println(R.getLength());
		System.out.println(R.getBreadth());
	}

}
