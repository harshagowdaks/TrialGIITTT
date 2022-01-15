package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee13 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex&openid.pape.max_auth_age=0");
    WebElement ele = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
    String text = ele.getText();
    System.out.println(text);
  
	}

}
