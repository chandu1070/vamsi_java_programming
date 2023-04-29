package day33;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class featurescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriver d=new ChromeDriver();
     	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.get("https://demo.nopcommerce.com/");
		d.manage().window().maximize();
		
		//Take a screenshot of specific feature
				WebElement fs=d.findElement(By.xpath("//img[@alt='Picture of Build your own computer']"));
				File src=fs.getScreenshotAs(OutputType.FILE);
				File tr=new File(("C:\\Users\\DELL\\SeleniumScreenshot\\laptop.png"));
				FileUtils.copyFile(src, tr);

	}

}
