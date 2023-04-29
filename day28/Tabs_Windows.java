package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_Windows {
public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriver d=new ChromeDriver();
			d.get("https://www.opencart.com/");
			//d.switchTo().newWindow(WindowType)
	        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	  
			d.manage().window().maximize();
			Thread.sleep(3000);

	}

}
