package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		driver.findElement(By.id("usernameField")).sendKeys("harsha.ks222@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordField")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.tagName("button")).sendKeys("waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform");;
	}
}
