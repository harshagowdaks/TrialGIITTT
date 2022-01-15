package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("harshaks222@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("123@123@ABC");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("harshaks2222@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("resume");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("curricullum vitae");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[contains(.,'Send')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'harsha')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='text']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("harshaks2222@yahoo.com");
		Thread.sleep(0000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("123@123@ABCd");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(7000);
		
	}
	
}
