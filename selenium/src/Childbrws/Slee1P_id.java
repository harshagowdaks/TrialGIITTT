package Childbrws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee1P_id {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.naukri.com/");
    Thread.sleep(4000);
    String P_id = driver.getWindowHandle();
    System.out.println(P_id);
    driver.quit();
}
}
