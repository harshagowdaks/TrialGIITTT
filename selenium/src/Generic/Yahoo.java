package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yahoo {
	@FindBy(id="login-username")
	private WebElement logintxtbox;
	@FindBy(id="login-signin")
	private WebElement nextbutton;
	@FindBy(xpath="//input[@id='login-passwd' and @name='password' ]")
	private WebElement passwordtxtbox;
	@FindBy(id="login-signin")
	private WebElement nextbutton1;
	
	public Yahoo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setlogin(String login)
	{
		logintxtbox.sendKeys(login);
	}
	public void clicknext()
	{
		nextbutton.click();	
	}
	public void setpassword(String password)
	{
		logintxtbox.sendKeys(password);
	}
	public void clicknext1()
	{
		nextbutton1.click();	
	}
	
}
