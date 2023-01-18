package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrameMethods extends BaseClass {
	public void toDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	public void toParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	public void frameByIndex(int frameindex)
	{
		driver.switchTo().frame(frameindex);
	}
	public void frameByname(String nameOfFrame)
	{
		driver.switchTo().frame(nameOfFrame);
	}
	public void frameByWebelement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}

}
