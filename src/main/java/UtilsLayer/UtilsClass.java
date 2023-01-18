package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	public static void enterValue(WebElement wb,String value)
	{
		if( (wb.isEnabled())&&(wb.isDisplayed()))
				wb.sendKeys(value);
	}
	public static void clickOnElement(WebElement wb)
	{
		if((wb.isEnabled())&&(wb.isDisplayed()))
				wb.click();
	}
}
