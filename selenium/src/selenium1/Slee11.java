package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Slee11 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key,value);
	    ChromeDriver driver = new ChromeDriver();
	}

}