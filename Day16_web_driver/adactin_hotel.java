package Day16_web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin_hotel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
	    d.findElement(By.name("username")).sendKeys("vamsikoppula1234");
		d.findElement(By.name("password")).sendKeys("vamsikoppula");
		d.findElement(By.name("login")).click();
		Thread.sleep(4000);
		d.navigate().back();
		d.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		d.navigate().back();
		d.findElement(By.linkText("New User Register Here")).click();
		Thread.sleep(3000);
		
       d.quit();
       
	}
}