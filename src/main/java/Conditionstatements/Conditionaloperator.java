 
package Conditionstatements;
public class Conditionaloperator {
public static void main( String[] args) {
		
		int num1=10, num2=45, num3=57;
		boolean result;
		
 //Conditional AND operator
		result=(num1>num2) && (num2>num3);
		System.out.println("Result is: "+ result);
		
//Conditional OR Operator
		
		result=(num1<num2) || (num2>num3);
		System.out.println("Result is : "+ result);
		
//ternary operator
		
result=num1<num2;
System.out.println("Result is : "+ result);
		
	}
	

}


