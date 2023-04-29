package day18_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");//launch the browser
		WebDriver d=new ChromeDriver();
        d.get("https://www.flipkart.com/");// launch the url
d.manage().window().maximize(); 
          List<WebElement> sliders =d.findElements(By.className("_3YgSsQ"));
          System.out.println("number of sliders:"+sliders.size());
         List<WebElement> links= d.findElements(By.tagName("a"));
          System.out.println("number of links:"+links.size());
	}

}

