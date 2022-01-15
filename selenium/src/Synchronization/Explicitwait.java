package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.amazon.in/");
    driver.findElement(By.xpath("//a[.=' Electronics ']")).click();
    driver.findElement(By.xpath("//a [@href='http://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6']")).click();
    WebDriverWait wait=new WebDriverWait(driver, 40);
    wait.until(ExpectedConditions.urlMatches("Amazon"));
    String url = driver.getCurrentUrl();
    System.out.println(url);
    }
}
