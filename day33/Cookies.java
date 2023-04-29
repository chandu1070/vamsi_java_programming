package day33;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

		public static void main(String[] args) {
			System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriver d=new ChromeDriver();
			d.get("https://demo.nopcommerce.com/");
			d.manage().window().maximize();

			//how to capture cookies from the browser
		  Set<Cookie> cook=d.manage().getCookies();
		  System.out.println("size of cookies:"+cook.size());
			
			//how to print cookies from the browser
		  for(Cookie c:cook)
		  {
			  System.out.println(c.getName()+"    " +c.getValue());
		  }
			
			//How to add new cookie to the browser
		  Cookie cookieobj=new Cookie("vamsi","123445");   //created own cookie
		d.manage().addCookie(cookieobj);     //added own cookie
		 cook=d.manage().getCookies();
		  System.out.println("size of cookies:"+cook.size());
		  
			// how to delete specific cookie from the cookies list
		 // d.manage().deleteCookie(cookieobj)
		  d.manage().deleteCookieNamed(".Nop.Culture ");
		  cook=d.manage().getCookies();
		  System.out.println("size of cookies after deletion:"+cook.size());
		 
		  //delete all cookies from the browser
		  d.manage().deleteAllCookies();
		  cook=d.manage().getCookies();
		  System.out.println("size of cookies after deletion:"+cook.size());
	}

}
