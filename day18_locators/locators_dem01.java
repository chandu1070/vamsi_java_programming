package day18_locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_dem01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");//launch the browser
		WebDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/newtours/");// launch the url
d.manage().window().maximize();                 // maximixe the window


//Register
d.findElement(By.linkText("Register here")).click();
d.findElement(By.name("firstName")).sendKeys("vamsi");
d.findElement(By.name("lastName")).sendKeys("koppula");
d.findElement(By.name("phone")).sendKeys("9346272443");
d.findElement(By.id("userName")).sendKeys("vamsikoppula56@gmail.com");
d.findElement(By.name("address1")).sendKeys("vissannapet");
d.findElement(By.name("city")).sendKeys("vijayawada");

List<WebElement> links=d.findElements(By.tagName("a"));
System.out.println("total no of links:"+links.size());



	








/*login
d.findElement(By.name("userName")).sendKeys("vamsikoppula");
d.findElement(By.name("password")).sendKeys("vamsikoppula");
Thread.sleep(4000);
d.findElement(By.name("submit")).click();*/



	}

}
