package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Facebooklogin;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			Facebook fb = new Facebook();
			fb.setusername("harsha.gowdaks222@gmail.com");
			Thread.sleep(2000);
			fb.setpassword("222@gowda");
			Thread.sleep(2000);
			fb.clickLogin();
}
}
