package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	@FindBy(xpath="//span[@class='user-display']")
	private WebElement loggedUsername;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String captureHomePageActualTitle()
	{
		return driver.getTitle();
	}
	
	public String captureHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean checkLogoiDisplayStatus() {
		return logo.isDisplayed();
	}
	
	public String checkLoggedUserNmae()
	{
		if(loggedUsername.isDisplayed())
		{
			return loggedUsername.getText();
		}
		return null;
	}

}
