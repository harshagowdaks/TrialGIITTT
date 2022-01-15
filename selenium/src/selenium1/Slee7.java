package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(1000);
		driver.findElement(By.xpath("// img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).click();
		Thread.sleep(1000);*/
		/*driver.findElement(By.xpath("//input[@class='sbse0x0']")).click();
		Thread.sleep(1000);*/
		/*driver.findElement(By.xpath("//input[@autocomplete=off']")).click();
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Mysuru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//id[@div='gridcell']")).click();
		Thread.sleep(1000);
		

	}

}
