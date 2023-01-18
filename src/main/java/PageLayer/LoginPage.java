package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement passward;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String uname)
	{
		UtilsClass.enterValue(username, uname);
	}
	public void typePassward(String pass)
	{
		UtilsClass.enterValue(passward, pass);
	}
	public void clickOnLoginButton() {
		UtilsClass.clickOnElement(loginbutton);
	}
	

}
