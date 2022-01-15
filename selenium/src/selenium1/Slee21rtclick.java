package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slee21rtclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(3000);
	   WebElement rClick = driver.findElement(By.xpath("//span[.='right click me']"));
	   Actions act=new Actions(driver);
	   act.contextClick(rClick).perform();
	}
}
