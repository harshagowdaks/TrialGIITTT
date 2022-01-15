package Childbrws;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slee3title_close {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.naukri.com/");
	    Thread.sleep(4000);
	    Set<String> allwh = driver.getWindowHandles();
	    int count = allwh.size();
	    System.out.println(count);
	    for(String wh:allwh){
	    	driver.switchTo().window(wh);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	Thread.sleep(2000);
	    	driver.close();
	    }
	    
	}
}
