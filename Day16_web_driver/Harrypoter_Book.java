package Day16_web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Harrypoter_Book {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","c://chrome.driver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=12882998091024695824&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20453&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAx6ugBhCcARIsAGNmMbh-ultu9xwt_Qkt47RLPTWv1fDM1XzMKD4aI9T5NA-ok86axw3Ja5caAoR7EALw_wcB");
		d.manage().window().maximize();
		System.out.println("amazon opened");
		 d.findElement(By.id("searchDropdownBox")).sendKeys("books");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("harry poter books");
		d.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(d.getTitle());
		d.navigate().back();
		d.navigate().forward();
		Thread.sleep(6000);
		d.close();

	}

}
