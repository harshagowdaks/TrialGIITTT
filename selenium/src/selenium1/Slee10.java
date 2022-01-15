package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee10 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 7t");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='nav-line-2']")).click();
			Thread.sleep(5000);
			
			
	}

}
