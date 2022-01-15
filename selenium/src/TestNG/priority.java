package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test
	public void tester1(){
		Reporter.log("hello", true);
	}
	@Test(priority=1)
	public void tester2(){
		Reporter.log("heyyy", true);
	}
}
