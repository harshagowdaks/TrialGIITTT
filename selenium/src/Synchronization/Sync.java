package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sync {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//a[.='Gift Cards']")).click();
	driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
    driver.findElement(By.xpath("//a[.='Mobiles']")).click();
    WebElement ele = driver.findElement(By.xpath("//a[.='Prime']"));
    Actions act=new Actions(driver);
    act.moveToElement(ele).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[.='Prime']")).click();
}
}
