package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester {
	@Test
	public void test1(){
		Reporter.log("hello", true);
		
	}
	@Test
	public void test2(){
		Reporter.log("HI");
	}
}
