package day14_exception_demo;

import java.util.Scanner;

public class Exception_drmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("programme is started");
		System.out.println("programme is inprogress");
		System.out.println("programme a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(100/num);
		System.out.println("programme is completed");
		System.out.println("programme is executed");
		programme is started
		programme is inprogress
		programme a number
		0
		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at javaprogramming/day14_exception_demo.Exception_drmo.main(Exception_drmo.java:14)*/
		/*int a[]=new int[5];
		System.out.println("enter number");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
	     System.out.println("enter a position");
	     int pos=sc.nextInt();
      	a[pos]=num;
	    System.out.println(a[pos]);
	   
	    enter number
	    67
	    enter a position
	    5
	    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	    	at javaprogramming/day14_exception_demo.Exception_drmo.main(Exception_drmo.java:29)*/
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str= sc.next();
		int num= Integer.parseInt(str);
		System.out.println(num);
		
		/*enter a string
		vamsikoppula
		Exception in thread "main" java.lang.NumberFormatException: For input string: "vamsikoppula"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at javaprogramming/day14_exception_demo.Exception_drmo.main(Exception_drmo.java:43)
*/
		
		
	


		
		

	}

}
