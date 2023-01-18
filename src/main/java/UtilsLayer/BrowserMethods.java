package UtilsLayer;

import BaseLayer.BaseClass;

public class BrowserMethods extends BaseClass{
	//minimize,maximize,refresh,back,forward,fullscreen,change dimention,......

	public void minimizeBrowser()
	{
		driver.manage().window().minimize();
	}
	
	public void fullscreenBrowser()
	{
		driver.manage().window().fullscreen();
	}
	public String titleOfWindow()
	{
		return driver.getTitle();
	}
	
	public String curruntUrlOfWindow()
	{
		return driver.getCurrentUrl();
	}
	public String pageSourceOfWindow()
	{
		return driver.getPageSource();
	}
	public void closetab()
	{
		driver.close();
	}
	
	public void closeAllWindow()
	{
		driver.quit();
	}
	
}
