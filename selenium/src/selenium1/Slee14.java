package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee14 {

		public static void main(String[] args) throws InterruptedException  {
		    System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_a909DD9D82084BA7CB7809DACE");
		    Thread.sleep(2000);
		    List<WebElement> links = driver.findElements(By.xpath("//a"));
		    for (WebElement link : links)
		    {
		    System.out.println(link.getAttribute("href"));
	}
	}
}
