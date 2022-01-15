package Childbrws;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sleeqtprntbrsr {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.naukri.com/");
	    Thread.sleep(8000);
	    String P_id = driver.getWindowHandle();
	    Set<String> allwh = driver.getWindowHandles();
	    int count = allwh.size();
	    System.out.println(count);
	    for(String wh:allwh){
	    	driver.switchTo().window(wh);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	Thread.sleep(2000);
	    	if(wh.equals(P_id)){
	    		driver.close();	
	    	}
	    	
	    }
	}
}
