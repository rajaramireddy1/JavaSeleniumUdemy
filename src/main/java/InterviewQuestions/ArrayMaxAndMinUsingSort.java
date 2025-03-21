package InterviewQuestions;

import java.util.Arrays;

public class ArrayMaxAndMinUsingSort {

	public static void main(String[] args) {
	  int a[]= {1,45,67,89,2,4,3};
	  Arrays.sort(a);
	  
	  System.out.println("Min Value = " + a[0] + " Max value = "+ a[a.length-1]);
	  System.out.println(a[a.length-2]);
	  
	  
	}

}

//SQl query to select the salary max and min and average from Employeee table
//Answer Select Max(Salary),Min(Salary),Avg(salary) From Employee;
