package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
 
}
