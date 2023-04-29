package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");//launch the browser
		WebDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/newtours/");// launch the url
         d.manage().window().maximize();                 // maximixe the window

d.findElement(By.cssSelector("input[name='userName']")).sendKeys("727272");
  
	}

}
