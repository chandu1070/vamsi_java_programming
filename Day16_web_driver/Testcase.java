package Day16_web_driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.in");
		d.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.navigate().to("http://www.google.com");
		Thread.sleep(5000);
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
 		d.navigate().forward();
	    d.quit();
	}

}
