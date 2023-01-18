package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
@Test(groups= {"regression","homepage"})
public class HomePageTest extends BaseClass {
	private HomePage homepage=new HomePage();
	
	@Test(priority=1)
	public void validateHomePageTitle()
	{
		Assert.assertEquals("Cogmento CRM",homepage.captureHomePageActualTitle());
	
	}
	@Test(priority=2)
	public void validateHomePageUrl()
	{
		Assert.assertEquals(true, homepage.captureHomePageUrl().contains("cogmento"));
	}
	@Test(priority=3)
	public void validateHomePageLogo()
	{
		Assert.assertEquals(true, homepage.checkLogoiDisplayStatus());
	}
	@Test(priority=4)
	public void validateHomePageUserName()
	{
		Assert.assertEquals(true, homepage.checkLoggedUserNmae().contains("Shubham electricals"));
	}

}
