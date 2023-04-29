package Assignment;

		import java.util.List;
		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		public class Ebay {
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.ebay.com/");
		    driver.manage().window().maximize();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
		        
			driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Marvel");
			driver.findElement(By.xpath("//select[@id='gh-cat']"));
			 WebElement categoriesDropdown = driver.findElement(By.id("gh-cat"));
		        Select categoriesSelect = new Select(categoriesDropdown);
		        categoriesSelect.selectByVisibleText("Books");
		        
		        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		        searchButton.click();
		        
		        // Write a method tprint all products from 1st page
		        List<WebElement> products = driver.findElements(By.className("s-item"));
		        for (WebElement product : products) {
		            System.out.println(product.getText());
		        }
		      
		        // Write a method to scroll down bottom of the page
		      //driver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        
		        // Quit the driver
		        driver.quit(); 
		   
		}
		}


	