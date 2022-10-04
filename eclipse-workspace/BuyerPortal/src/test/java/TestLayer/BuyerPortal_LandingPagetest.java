package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BuyerPortal.qa.testing.ReusableFunction;


public class BuyerPortal_LandingPagetest extends BaseTest {
	
	
	@Test(enabled=false)
public void search() throws InterruptedException
	
	{
		
		landinpage.landingpage(properties.getProperty("buyersearch"));
//		String expectedtext = "table";
//        String actualtext = driver.findElement(By.xpath("//input[@value='table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}
	@Test(enabled=false)
	
	public void popularSearch() throws InterruptedException
	
	{
		landinpage.landingpage1();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	@Test(enabled=false)
	public void categories() throws InterruptedException
	
	{
		landinpage.landingpage2();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	
	@Test(enabled=false)
	public void testimonials() throws InterruptedException
	
	{
		landinpage.testimonials1();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	@Test(enabled=false)
	public void footer1() throws InterruptedException, IOException
	
	{
		landinpage.footer();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	
	@Test	(enabled=false)
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
	@Test(priority=1)
	public void searchpage() throws InterruptedException
	
	{
		searchpage.searchpage2(properties.getProperty("buyersearch"), properties.getProperty("name2"),properties.getProperty("name2"),properties.getProperty("s3"), properties.getProperty("path"), properties.getProperty("sheet"), 1, 0);
	}
}