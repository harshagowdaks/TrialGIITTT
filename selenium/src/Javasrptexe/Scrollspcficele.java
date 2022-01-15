package Javasrptexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollspcficele {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//a[.='Help']"));
	Point locn = ele.getLocation();
	int x = locn.getX();
	int y = locn.getY();
	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy("+x+","+y+")");
Thread.sleep(2000);
ele.click();
}
}
