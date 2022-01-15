package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slee19robot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	   WebElement rClick = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	   Actions act=new Actions(driver);
	   act.contextClick(rClick).perform();
	    Thread.sleep(3000);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	}
}
