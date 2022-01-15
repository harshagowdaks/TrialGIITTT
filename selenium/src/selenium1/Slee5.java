package selenium1;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/sel/new2.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("HARSHA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("GOWDA K S");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("14-4-1997");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("QA");
		Thread.sleep(1000);
	}

	}


