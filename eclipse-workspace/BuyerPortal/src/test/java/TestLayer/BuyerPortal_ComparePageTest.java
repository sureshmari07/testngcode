package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortal_ComparePageTest extends BaseTest{
	
	
	
	@Test	(priority=1)
	public void signInPageTest() throws InterruptedException
	
	{
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"));

	}
	
   @Test(priority=2)
	public void comparePage01() throws InterruptedException
	{
		ProductComparePage.comparePage();
		
	}
   @Test	(priority=3)
	public void contactSupplier()
	
	{
		
		  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"));
    	
	}
	@Test	(priority=4)
	public void contactSupplier1()
	
	{
		
		  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"));
    	
	}
	@Test	(priority=5)
	public void requestQuote() throws InterruptedException
	
	{
		
		  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("incoterm"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
    	 
 		}
@Test	(priority=6)
public void compare() throws InterruptedException
	
	{
		
	ProductComparePage.comparePage1();
 		}
	
@Test	(priority=7)
	public void contactSupplier11()
	
	{
		
		  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"));
  	
	}
	@Test	(priority=8)
	public void contactSupplier12()
	
	{
		
		  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"));
  	
	}
	@Test	(priority=9)
	public void requestQuote1() throws InterruptedException
	
	{
		
		  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("incoterm"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
  	 
		}
	}

