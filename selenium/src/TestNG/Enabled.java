package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled=false)
		public void tester(){
			Reporter.log("hello", true);
		}
	@Test
	public void tester1(){
		Reporter.log("heyyy", true);
	}
}
