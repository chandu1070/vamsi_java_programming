package Assignment;

public class Fibonacci_series {

	public static void main(String[] args) {
		
	int a=0,b=1,c;
	for(int i=0;i<=15;i++)
	{
		
		c=a+b;
	
		System.out.print(" "+c);
		a=b;
		b=c;// 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597
	}
}
}