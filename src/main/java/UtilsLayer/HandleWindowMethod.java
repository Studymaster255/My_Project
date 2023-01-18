package UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindowMethod extends BaseClass {
	protected Set<String> ls;
	public static String handleSingleWindow()
	{
		return driver.getWindowHandle();
	}
	public static Set<String> handleMultipleWindow()
	{
		return driver.getWindowHandles();
	}
	
	public  ArrayList<String> handleWindows() 
	{
		ls=driver.getWindowHandles();
		Iterator<String> it = ls.iterator();
		ArrayList<String> arr = new ArrayList<String>();
		
		while (it.hasNext()) 
		{
			arr.add(it.next());
		}
		return arr;
	}
	public int countOfOpenedWindow()
	{
		return driver.getWindowHandles().size();
	}
	public void switchTowindow(int windowno)
	{
		handleWindows();
		driver.switchTo().window(handleWindows().get(windowno));
	}
}
