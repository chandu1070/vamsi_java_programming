package day33;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("http://www.deadlinkcity.com/");
		d.manage().window().maximize();
		List<WebElement> links=d.findElements(By.tagName("a"));
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
	        URL link =new URL(url);
	        try
	        {
	        
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			httpConn.connect();
			if(httpConn.getResponseCode()>=400)
			{
				System.out.println(httpConn.getResponseCode()+"    " +url +"  "+ " Broken link");
				
			}
			else
			{
				System.out.println(httpConn.getResponseCode()+"    " +url +"  "+ " NotBroken link");	
			}
	        }
				catch(Exception e)
	        {
			}
		}
	}
}
