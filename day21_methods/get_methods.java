package day21_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_methods {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
     System.out.println("title of the page :"+ d.getTitle()); // return title of the web page
    System.out.println("URL:"+d.getCurrentUrl());
    System.out.println("URL ID:"+d.getWindowHandle()); //URL ID:CDwindow-ED4824B0BF0EF207081205B36CC9D65B
        d.findElement(By.linkText("OrangeHRM, Inc")).click();                                            //URL ID:CDwindow-FEC292749E541A5F64FD76465233E752
    Set<String> windowIDs= d.getWindowHandles();
    for (String winid: windowIDs )   
    {
    System.out.println(winid);	
    }
        
        
        d.close();  
	}
	

}
