package Takescrrenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrnn {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File temp = ts.getScreenshotAs(OutputType.FILE);
		
	File hdd = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screen\\screesht.jpeg");
	
	FileUtils.copyFile(temp, hdd);
}
}
