package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/sel/new2.html");
		Thread.sleep(2000);
		/*driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("a1")).click();
		driver.findElement(By.name("n1")).click();
		driver.findElement(By.className("c1")).click();*/
		driver.findElement(By.linkText("bingo")).click();
		//driver.findElement(By.partialLinkText("bin")).click();//
		

	}

}
