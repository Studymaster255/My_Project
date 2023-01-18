package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class TestCogmento_one extends BaseClass {
	
	@BeforeTest
	public void setup() throws IOException
	{
		BaseClass.intilization();
		Assert.assertEquals(true, driver.getCurrentUrl().contains("cogmento"));
	}
	
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("passward"));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String a=driver.getCurrentUrl();
		Assert.assertEquals(true, a.contains("cogmento"));
	}

	@AfterTest
	public void teardown() throws InterruptedException
	{
		System.gc();
		Thread.sleep(5000);
		driver.close();
		
	}

}
