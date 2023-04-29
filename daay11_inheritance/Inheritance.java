package daay11_inheritance;
class MOTHER
{
	int a=100;
	void dispaly()
	{
		System.out.println(a);
	}
}
class  SON extends MOTHER
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}
	
public class Inheritance {

	public static void main(String[] args) {
		B bobj=new B();
		bobj.dispaly();
		bobj.show();
		

}
}

