package daay11_inheritance;
class A
{
	int a=100;
	void dispaly()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}

public class Multilevel_Inheritance_types {

	public static void main(String[] args) {
		C cobj=new C();
		cobj.dispaly();
		cobj.show();
		cobj.print();
		
			
	}
	
}

