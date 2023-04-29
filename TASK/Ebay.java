package TASK;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

            public class Ebay{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.ebay.com/b/Golf-Clubs-Equipment/181153/bn_7203723?_trkparms=%26clkid%3D8314021026185928724");
		d.manage().window().maximize();
		d.findElement(By.id("gh-cat")).sendKeys("Cell Phones & Accessories");
		d.findElement(By.id("gh-ac")).sendKeys("apple watches");
		d.findElement(By.id("gh-btn")).click();
		WebElement bay=d.findElement(By.id("srp-river-results"));
		List<WebElement>buy=bay.findElements(By.tagName("li"));
		System.out.println(buy.size());
		for(int i=0;i<buy.size();i++) {
			System.out.println(buy.get(i).getText());
		}

	}

}
