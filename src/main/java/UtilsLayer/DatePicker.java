package UtilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DatePicker extends BaseClass {
	//Month_year format shoud be like May 2022
	//This code is not valid for all all non select calender
	public void date_month_year(WebElement _calender,WebElement _monthYear,
			WebElement _next,String month_year,String date)
	{
		_calender.click();
		while(true)
		{
			//String b =driver.findElement(By.xpath
			//("//td[@class='monthTitle']")).getText();
			String b =_monthYear.getText();
			//System.out.println(b);
			if(b.equals(month_year))
			{
				break;
			}else {
				//driver.findElement(By.xpath("//td[@class='next']")).click();
				_next.click();
			}	
		}
		//This xpath will be variable from site to site
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']"
				+ "//td[text()='"+date+"']")).click();
	}
}
