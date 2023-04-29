package day18_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");//launch the browser
		WebDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/newtours/");
d.manage().window().maximize();               
d.findElement(By.linkText("Bank Project")).click();

Thread.sleep(3000);
d.findElement(By.name("uid")).sendKeys("mngr484619");
d.findElement(By.name("password")).sendKeys("jUserEm");
d.findElement(By.name("btnLogin")).click();
Thread.sleep(4000);
d.quit();
	}

}
