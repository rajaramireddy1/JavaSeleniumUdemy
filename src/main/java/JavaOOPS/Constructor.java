package JavaOOPS;

class Constructors {

	public double length;
	public double breadth;

	public Constructors() { //non parameterised constructor
		length =1;
		breadth = 1;
	}

	public Constructors(double l, double b) { // parameterised constructor

		length=l;
		breadth=b;
	}
	public Constructors(double s) { // parameterised constructor

		length=breadth=s;
	}
	

	public double Area() {
		return length*breadth;
	}



}

public class Constructor {

	public static void main(String[] args) {

		Constructors C = new Constructors(); //It calls defaulty non parameterized constructor

		System.out.println(C.Area());

		Constructors C1 = new Constructors(10 , 5); //It calls parameterized constructor

		System.out.println(C1.Area());
		
		Constructors C2 = new Constructors(5); //It calls parameterized constructor

		System.out.println(C2.Area());




	}

}
