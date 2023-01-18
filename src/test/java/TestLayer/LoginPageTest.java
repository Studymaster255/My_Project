package TestLayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	private LoginPage loginpage;
	@BeforeTest (groups= {"regression","login"})
	public void setUp() throws IOException
	{
		BaseClass.intilization();
	}
	
	@Test(groups= {"regression","login"})
	public void validateLoginFunctionality() throws InterruptedException
	{
		loginpage=new LoginPage();
		loginpage.typeUsername(prop.getProperty("username"));
		Thread.sleep(2000);
		loginpage.typePassward(prop.getProperty("passward"));
		loginpage.clickOnLoginButton();
	}
	
	@AfterTest(groups= {"regression","login"})
	public void tearDoen() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.close();
		System.gc();
	}
	
	
}
