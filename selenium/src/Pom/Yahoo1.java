package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Yahoo;

public class Yahoo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&add=1");
		Thread.sleep(2000);
		Yahoo yv = new Yahoo(driver);
		yv.setlogin("harshaks222@yahoo.com");
		Thread.sleep(4000);
		yv.clicknext();
		Thread.sleep(6000);
		yv.setpassword("@123@123@ABC");
		Thread.sleep(4000);
		yv.clicknext1();
		
	}
}
