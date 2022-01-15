package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test 
	public void Gmail(){
		Reporter.log("compose");
	}
	@Test
	public void Type(){
		Reporter.log("type");
	}
	@Test(invocationCount=3)
	public void Com(){
		Reporter.log("send");
	}
	@Test
	public void Trash(){
		Reporter.log("TRASH");
	}
}
