package Day16_web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github_signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://github.com/login");
		d.manage().window().maximize();
		Thread.sleep(4000);
		d.findElement(By.name("login"));
		d.findElement(By.name("password"));
		d.findElement(By.name("Sign in"));
		Thread.sleep(5000);
		d.close();
		
		

	}

}
