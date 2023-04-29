package Assignment;

import java.util.Scanner;

public class Power_exponent {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int base,exponent;
	double result;
	System.out.println("enter the base value");;
	base=sc.nextInt();
	System.out.println("enter the component value");
	exponent=sc.nextInt();
	result=Math.pow(base,exponent);
	System.out.println(result);

	}

}
