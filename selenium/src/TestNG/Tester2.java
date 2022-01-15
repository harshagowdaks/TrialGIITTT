package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester2 {
	@Test
		public void test(){
			Reporter.log("heyyy", true);
		}
	@Test
	public void test2(){
		Reporter.log("hiii", false);
	}
	
}
