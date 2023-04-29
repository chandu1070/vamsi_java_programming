package day9;

public class Constructor_demo {
	private static final String str = null;
	int x,y;
	String s;
	/*Constructor_demo() // default constructor
	{
		System.out.println("this is default constructor");*/
	Constructor_demo(int a, int b,String s)
	{
	x=a;
	y=b;
	s=str;
	System.out.println(x+" "+y+"  "+s);
	
	}

	public static void main(String[] args) {
		//Constructor_demo cd=new Constructor_demo();
		Constructor_demo cd=new Constructor_demo(10,20,"welcome");
		

	}

}
