package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom.Loginpage;

public class Scriptlogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	Loginpage lp=new Loginpage(driver);
			lp.clickLogin();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			lp.clickLogin();
}
}
