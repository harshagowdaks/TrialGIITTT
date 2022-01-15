package Javasrptexe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Overrides {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	for (int i = 1; i < 5; i++) {
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
	}
	for (int i = 1; i < 5; i++) {
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(2000);
	}
	
}
}
