package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortalLogin extends BaseTest {
	
	
	//invalid email and valid password

	@Test	(priority=1)
	public void signInPageTest() 
	{
		
		buyersign.signIn(properties.getProperty("l_email1"),properties.getProperty("l_password1"));
	    String actualtext = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText();
        String expectedtext = "Please verify your email address before signing in";
   
        try {
			ReusableFunction.assertion1(expectedtext, actualtext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	//without entering username and password
	@Test	(priority=2)
	public void signInPageTest1() 
	{
		
		buyersign.signIn1(properties.getProperty("l_email2"),properties.getProperty("l_password2"));
	    String actualtext = driver.findElement(By.xpath("//div[text()='\"email\" is not allowed to be empty']")).getText();
        String expectedtext = "\"email\" is not allowed to be empty";
   
        
        try {
			ReusableFunction.assertion1(expectedtext, actualtext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	   //without giving password
        @Test	(priority=3)
    	public void signInPageTest2() 
    	{
    		
        	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("l_password2"));
    	    String actualtext = driver.findElement(By.xpath("//div[text()='\"password\" is not allowed to be empty']")).getText();
            String expectedtext = "\"password\" is not allowed to be empty";
       
            
            try {
    			ReusableFunction.assertion1(expectedtext, actualtext);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        
	}
        //without giving username 
        @Test	(priority=4)
    	public void signInPageTest3() 
    	{
    		
        	buyersign.signIn1(properties.getProperty("l_email2"),properties.getProperty("l_password1"));
            String actualtext = driver.findElement(By.xpath("//div[text()='\"email\" is not allowed to be empty']")).getText();
            String expectedtext = "\"email\" is not allowed to be empty";
       
            
            try {
    			ReusableFunction.assertion1(expectedtext, actualtext);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        
}
      //invalid username and invalid password
        @Test	(priority=5)
    	public void signInPageTest4() 
    	{
    		
        	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("l_password1"));
            String actualtext = driver.findElement(By.xpath("//div[text()='Incorrect username or password.']")).getText();
            String expectedtext = "Incorrect username or password.";
       
            
            try {
    			ReusableFunction.assertion1(expectedtext, actualtext);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        
        
    	}  
        //valid  username and valid password
        @Test	(priority=6)
    	public void signInPageTest5() 
    	{
    		
        	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
            String actualtext = driver.getTitle();
            String expectedtext = "Proxtera";
       
//            
//            try {
//    			ReusableFunction.assertion(expectedtext, actualtext);
//    		} catch (IOException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
//       
//    	}	
//        
}
}