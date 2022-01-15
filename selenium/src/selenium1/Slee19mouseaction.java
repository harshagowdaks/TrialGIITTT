package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;

public class Slee19mouseaction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    Thread.sleep(3000);
	   WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
	   Actions act=new Actions(driver);
	   act.moveToElement(ele).perform();
	   
	    
}
}
