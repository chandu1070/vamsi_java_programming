package daay11_inheritance;
class PARENT
{
	void display(int a)
	{
	System.out.println(a);
	}	
}
class CHILD1 extends PARENT
{
	void show(int b)
	{ 
		System.out.println(b);
	}
}
 class CHILD2 extends PARENT
 {
	 void print(int c)
	 {
		 System.out.println(c);
	 }
 }

public class Hierarchy_inheritance {

	public static void main(String[] args) {
	CHILD1 c1=new CHILD1();
	CHILD2 c2=new CHILD2();
	PARENT p=new PARENT();
	c1.show(300);
	c2.print(111);
	p.display(75);
	
	
			
			
			
			
			
			
			
			
			
			
			

	}

}
