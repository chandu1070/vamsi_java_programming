package day9;

public class Method_overloading {
	int x,y,z;
	double d;
		void sum()//1
		{
			x=10;
			y=20;
			System.out.println(x+y);
		}
		void sum(int a,int b) //2
		{
			x=a;
			y=b;
				System.out.println(x+y);		
	}
void sum(int a,double dec) //3
{
	x=a;
	d=dec;
	System.out.println(x+d);
	
}
void sum(double dec,int a)
{
	d=dec;
	x=a;
	System.out.println(d+x);
}
void sum(int a,int b,int c)
{
	x=a;
	y=b;
	z=c;
	System.out.println(x+y+z);
}
	public static void main(String[] args) {
		
		Method_overloading mo=new Method_overloading();
		mo.sum();
		mo.sum(10,200);
		mo.sum(107,20.3);
		mo.sum(20.3,108);
		mo.sum(10,20,3500);
	}
		

	}


