package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slee19drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Thread.sleep(3000);
	   WebElement b1 = driver.findElement(By.id("box3"));
	   WebElement b2 = driver.findElement(By.id("box103"));
	    Thread.sleep(3000);
	   Actions act=new Actions(driver);
	   act.dragAndDrop(b1, b2).perform();
	   
	}	   
}
