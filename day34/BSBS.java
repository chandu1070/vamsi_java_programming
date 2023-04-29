package day34;

import org.testng.annotations.Test;

public class BSBS {
	@Test
	void openapp()
	{
       System.out.println("opening application");
    }  
	@Test
	void login()
    {
		System.out.println("login to application");	
    }
	@Test
	void logout()
	{
		System.out.println("logout to application");		
	}
    @Test
	void closeapp() 
	{
		
		System.out.println("closing the application");		
	}
}
