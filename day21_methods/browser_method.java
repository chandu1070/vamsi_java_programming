package day21_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
				
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Thread.sleep(4000);
		
	d.close();	 
	//d.quit(); 
	
	}

}
