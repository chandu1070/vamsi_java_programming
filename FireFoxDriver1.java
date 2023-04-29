import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d= new FirefoxDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();

	}

}
