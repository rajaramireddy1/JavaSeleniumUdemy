package Dummy;

public class NumSum {

	public static void main(String[] args) {
		int num=123;
		int Sum=0 , rem=0;
		
		while(num!=0) {
		rem = num%10;
		Sum = Sum + rem;
		num=num/10;
		}
		 
System.out.println(Sum);
	
	}

}
