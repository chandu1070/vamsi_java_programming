package day33;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriver d=new ChromeDriver();
	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//d.get("https://www.cricbuzz.com/");
        d.get("https://demo.nopcommerce.com/");
		d.manage().window().maximize();

		//Take a screenshot of entire screen
		TakesScreenshot ts=(TakesScreenshot)d;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\DELL\\SeleniumScreenshot\\cricbuzz.png");
		FileUtils.copyFile(src, target);
		
		//Take a screenshot of specific feature
		WebElement fs=d.findElement(By.xpath("//img[@alt='Picture of Build your own computer']"));
		 src=fs.getScreenshotAs(OutputType.FILE);
		 target=new File(("C:\\Users\\DELL\\SeleniumScreenshot\\laptop.png"));
		//FileUtils.copyFile(src, target);
          FileUtils.copyFile(src, target)
		
		;
		
		
		
				
			
		
		

	}

}
