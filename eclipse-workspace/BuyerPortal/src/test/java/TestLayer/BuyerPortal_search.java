package TestLayer;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortal_search extends BaseTest{
	
	
	@Test	(priority=1)
	public void signInPageTest()
	
	{
		
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
//		String expectedtext = "Food";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Food']")).getText();
//        try {
//			ReusableFunction.assertion(expectedtext, actualtext);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Test	(priority=2)
	public void loginsearchPageTest() throws InterruptedException
	
	{
	
	  
	loginsearch.loginsearch(properties.getProperty("buyersearch"));
//	String expectedtext = "Apollo Table (Worldwide)";
//       String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//     	try {
//     		ReusableFunction.assertion1(expectedtext, actualtext);
//     	}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
	   
	}
	
	@Test	(priority=3)
	public void contactSupplier()
	
	{
		
		  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"));
     	  String expectedtext = "Apollo Table (Worldwide)";
          String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
          try {
  			ReusableFunction.assertion1(expectedtext, actualtext);
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
	}
	@Test	(priority=4)
	public void contactSupplier1()
	
	{
		
		  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"));
     	  String expectedtext = "Apollo Table (Worldwide)";
          String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
          try {
  			ReusableFunction.assertion1(expectedtext, actualtext);
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
	}
	@Test	(priority=5)
	public void requestQuote() throws InterruptedException
	
	{
		
		  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("incoterm"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
     	  String expectedtext = "Apollo Table (Worldwide)";
          String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
          try {
  			ReusableFunction.assertion1(expectedtext, actualtext);
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
	}
	@Test	(enabled=false)
	public void profileUpdate()
	
	{
		
		  buyerprofileupdate.profileUpdate(properties.getProperty("update_firstname"), properties.getProperty("update_lasttname"), properties.getProperty("update_mobile"), properties.getProperty("email"), properties.getProperty("addnew_firstname"), properties.getProperty("addnew_lastname"), properties.getProperty("designation"),properties.getProperty("update_mobilecode"));
     	  //String expectedtext = "Apollo Table (Worldwide)";
          WebElement actualtext = driver.findElement(By.xpath("//div[text()='User already exists']"));
          ReusableFunction.elementIsVisible(actualtext);
//          try {
//  			ReusableFunction.assertion(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
//  	   
	}
//	@Test	(priority=7)
//	public void businessBuyer()
//	
//	{
//		
//		  buyerprofileupdate.becomeBusinessbuyer(properties.getProperty("current_email"), properties.getProperty("business_email"), properties.getProperty("password"), properties.getProperty("company_name"), properties.getProperty("country_registration"), properties.getProperty("business_taxid"), properties.getProperty("business_countrycode"),properties.getProperty("business_number"));
//     	  //String expectedtext = "Apollo Table (Worldwide)";
//          WebElement actualtext = driver.findElement(By.xpath("//div[text()='User already exists']"));
//          ReusableFunction.elementIsVisible(actualtext);
////          try {
////  			ReusableFunction.assertion(expectedtext, actualtext);
////  		} catch (IOException e) {
////  			// TODO Auto-generated catch block
////  			e.printStackTrace();
////  		}
////  	   
//	}
	
//	@Test	(priority=6)
//	public void searchPageTest()
//	
//	{
//		
//		  buyersearch.search(properties.getProperty("buyersearch"));
//     	  String expectedtext = "Apollo Table (Worldwide)";
//          String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//          try {
//  			ReusableFunction.assertion(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
//  	   
//	   
//	}
	
}
