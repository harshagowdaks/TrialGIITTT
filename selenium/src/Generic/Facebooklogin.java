package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {
	@FindBy(id="email")
	private WebElement untxtbox;
	@FindBy(id="pass")
	private WebElement passtxtbox;
	@FindBy(xpath="//button[.='Log In']")
	private WebElement Loginbtn;
	public Facebooklogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un)
	{
		untxtbox.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		passtxtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		Loginbtn.click();
	}
}
