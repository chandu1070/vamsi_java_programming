package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");//launch the browser
		WebDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/newtours/");// launch the url
         d.manage().window().maximize();                 // maximixe the window
         //relative xpath
         d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mngr484619");
         
         d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("jUserEm");
         //Absolute xpath
         d.findElement(By.xpath("//input[@name='submit']")).click();
         

	}

}
