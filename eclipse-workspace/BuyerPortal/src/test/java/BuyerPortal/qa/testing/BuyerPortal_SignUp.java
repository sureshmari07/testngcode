package BuyerPortal.qa.testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortal_SignUp {  
	private WebDriver driver;
	private ReusableFunction reusable;
	
    private By joinus=By.xpath("//div[text()='Join Us']");
	//private By joinusnow =By.xpath("//span[text()='Join us now']");
	private By email=By.xpath("//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary input css-9ddj71-MuiInputBase-root-MuiOutlinedInput-root']/child::input[@name='email']");
	private By signup=By.xpath("(//p[text()='Sign - Up'])[2]");
	private By username=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By signupbutton=By.xpath("(//p[text()='Sign - Up'])[2]");
	
	private By changeemail=By.xpath("//span[text()='Change Email ?']");
	private By close=By.xpath("//div[@class='modal_wrapper']/child::*[@class='float-right']");
	
	private By signupasbusiness=By.xpath("//div[text()='Sign up as a Business ']");
	private By companyname=By.xpath("//input[@name='company_name']");
	private By countryregistration=By.xpath("//input[@id='autocomplete']");
	private By taxid=By.xpath("//input[@name='tax_id']");
	private By countrycode=By.xpath("(//div[@class='MuiAutocomplete-endAdornment css-1q60rmi-MuiAutocomplete-endAdornment'])[2]");
	private By contactnumber=By.xpath("//input[@name='phone_number']");
	
	private By businessemail=By.xpath("//input[@placeholder='Business Email Address*']");
	private By businesspassword=By.xpath("//input[@placeholder='Password*']");
	private By businessemailcheckbox=By.xpath("(//input[@type='checkbox'])[1]");
	private By termsofusecheck=By.xpath("(//input[@type='checkbox'])[2]");
	
	
	
	public BuyerPortal_SignUp(WebDriver driver) {
		this.driver=driver;
		
	    reusable=new ReusableFunction(this.driver);
		}
	
	public void signUp(String name1,String name2,String name3)
	{
	reusable.click(joinus);;
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(username, name2);
	reusable.insertText(password,name3);
	reusable.click(signupbutton);
	
	

}
	
	public void signUp1(String name1,String name2,String name3)
	{
    reusable.clicking(close);	
	reusable.click(joinus);;
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(username, name2);
	reusable.insertText(password,name3);
	reusable.click(signupbutton);
	
}
	
	
	

}
