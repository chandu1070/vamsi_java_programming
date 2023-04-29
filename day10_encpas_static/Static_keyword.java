package day10_encpas_static;

public class Static_keyword {
     int a=10;
     static int b=20;
void dispaly()
{
	System.out.println("a is non static variable");
	
}
static void show()
{
	System.out.println(" b is ststtic variable");
}
	public static void main(String[] args) {
//System.out.println(a);
System.out.println(b);
//dispaly();
show();
Static_keyword sk=new Static_keyword();
System.out.println(sk.a);

sk.dispaly();

	}

}
