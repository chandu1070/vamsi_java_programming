package day21_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigational_commands {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver d=new ChromeDriver();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
	d.navigate().to("https://www.amazon.in/");
	d.navigate().to("https://www.snapdeal.com/");
	
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	System.out.println(d.getCurrentUrl());
	d.navigate().forward();
	Thread.sleep(2000);
	System.out.println(d.getCurrentUrl());
	d.navigate().refresh(); 
	}

}
