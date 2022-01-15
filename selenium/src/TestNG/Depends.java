package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends{
	@Test
		public void tester(){
			Reporter.log("hello", true);
		}
	@Test(dependsOnMethods="tester")
	public void tester1(){
		Reporter.log("heyyy", true);
		Assert.fail();
	}
	@Test(dependsOnMethods="tester1")
	public void tester2(){
		Reporter.log("yup", true);
	}
	
}
