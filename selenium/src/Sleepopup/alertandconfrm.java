package Sleepopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertandconfrm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(4000);
	driver.findElement(By.name("cusid")).sendKeys("hhhhhh");
	Thread.sleep(4000);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(4000);
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	//a.accept();
}
}
