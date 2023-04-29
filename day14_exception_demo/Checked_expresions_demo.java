package day14_exception_demo;

public class Checked_expresions_demo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
	    System.out.println("programme is started");
		System.out.println("programme is inprogress");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("programme is execute");
		System.out.println("programme is executed");

	}
	}
	
	

