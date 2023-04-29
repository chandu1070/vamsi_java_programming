package day12;
interface shape
{
int length=10; // final& static keyword
int width =20;   //final&static keyword
void circle();    //abstarct method
default void rectangle()
{
	System.out.println(" this is an rectangle");
}
static void triangle()
{
	System.out.println("this is an triangle");
	
}

public class Interfacedemo implements shape
{
public void circle()
{
System.out.println("this is an circle");
} 

public static void main(String[] args) {
	shape s= new Interfacedemo();
	s.circle();
	s.rectangle();
    shape.triangle();
	

}
}

}
