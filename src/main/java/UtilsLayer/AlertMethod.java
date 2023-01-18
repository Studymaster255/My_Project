package UtilsLayer;

import org.openqa.selenium.Alert;

import BaseLayer.BaseClass;

public class AlertMethod extends BaseClass {
	protected static Alert alt;
	public void focusOnAlert()
	{
		alt=driver.switchTo().alert();
	}
	public void accept()
	{
		alt.accept();
	}
	public void dismiss()
	{
		alt.dismiss();
	}
	public String captureText()
	{
		return alt.getText();
	}
	public void sendKeys(String data)
	{
		alt.sendKeys(data);
	}
}
