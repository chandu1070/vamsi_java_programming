package Day16_web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d.findElement(By.name("//input[@placeholder='Password']")).sendKeys("admin123");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
		
		//d.findElement("xpath=//button[@type='submit']");
	d.close();
	}
	
}

