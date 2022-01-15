package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?hl=kn&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
	    Thread.sleep(4000);
	    WebElement ele=driver.findElement(By.xpath("//a[.='ಸಹಾಯ']"));
	    String url=ele.getAttribute("href");
	    System.out.println(url);
	}
     
}
