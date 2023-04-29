package daay11_inheritance;
class  BANK
{
	double roi()
	{
			return 0;
	}
}

class ICICI extends BANK
{
	double roi()
	{
		return 10.54;
	}
}
class CANARA extends BANK
{
double roi()
{
	return 12;
}
public class Over_riding {

public static void main(String[] args)
	{
ICICI ic=new ICICI();
System.out.println(ic.roi());
CANARA can=new CANARA();
System.out.println(can.roi());


}
}
}

