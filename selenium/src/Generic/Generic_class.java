package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class {
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void closebrowswer(){
		driver.close();
	}
}
