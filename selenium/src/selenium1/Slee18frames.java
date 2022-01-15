package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee18frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("file:///C:/Users/Admin/OneDrive/Desktop/sel/mainpage1.html");
	    Thread.sleep(3000);
	    
	    
	     WebElement addrFrame = driver.findElement(By.xpath("//iframe[@id='f1']"));
	   driver.switchTo().frame(addrFrame);
	    driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("abc");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("123");
	    Thread.sleep(3000);
	    driver.close();
	}

}
