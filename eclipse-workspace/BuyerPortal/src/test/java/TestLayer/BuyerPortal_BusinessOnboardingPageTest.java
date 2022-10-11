package TestLayer;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class BuyerPortal_BusinessOnboardingPageTest extends BaseTest{
	@Test	(priority=1)
	public void signInPageTest() throws InterruptedException
	
	{
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"));

	}
	
	@Test	(priority=2)
	public void basicBusinessDetails() throws InterruptedException, AWTException
	
	{
		businessPage.basicBusinessDetailsPage(properties.getProperty("filepath"),properties.getProperty("filepath"),properties.getProperty("tin"),properties.getProperty("CountryofIncorporation"),properties.getProperty("CountryofIncorporation"),properties.getProperty("doi"),properties.getProperty("companywebsite"),properties.getProperty("primary"));

	}

}
