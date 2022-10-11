package BuyerPortal.qa.testing;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_BusinessOnboardingPage {
    
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By companylogo=By.xpath("//div[@class=\"upload-logo\"]");
	private By applybutton=By.xpath("//button[text()='Apply']");
	private By changebutton=By.xpath("//span[text()='Change Photo']");
	private By coverphoto=By.xpath("//button[text()='EDIT']");
	private By entityname=By.xpath("//input[@id=\"corporate_name\"]");
	private By countryofincorporation=By.xpath("//input[@id=\"country_of_incorporation\"]");
	private By CountryofOperation=By.xpath("//input[@id=\"country_of_operation\"]");
	private By tin=By.xpath("//input[@id=\"tax_id\"]");
	private By Registrationcheckbox=By.xpath("//span[text()='Registration Number same as Tax ID']");
	private By EntityRegistrationNumber=By.xpath("//input[@id=\\\"registration_number\\\"]");
	private By doi=By.xpath("//input[@id=\"date_of_incorporation\"]");
	private By companywebsite=By.xpath("//input[@id=\"website\"]");
	private By PrimaryIndustry=By.xpath("(//input[@aria-autocomplete=\"list\"])[4]");
	private By SecondaryIndustry=By.xpath("//input[@id=\":r61:\"]");
	private By TypeofEntity=By.xpath("//input[@id=\"entity_type\"]");
	private By NoofEmployees=By.xpath("//input[@id=\"company_size\"]");
	private By AnnualTurnover=By.xpath("//input[@id=\"revenue_range\"]");
	private By OnlinePages=By.xpath("//input[@id=\":r6h:\"]");
	private By companydescription=By.xpath("//textarea[@id=\"outlined-multiline-flexible\"]");
	private By nextbutton=By.xpath("//button[text()='Next']");
	
//	location=//input[@id="address"]
//			mailing address=//span[text()='I have a different mailing address']
//			code=//input[@id="primary_country_code"]
//			phone=//input[@id="primary_phone"]
//			+symbol=(//*[local-name()='svg' and @data-testid="AddCircleIcon"])[1]
//			checkbox=//span[text()='I would like to set main working hours for my business.']
//			button=//button[text()='Next']
//			button=//button[text()='Back']

	
	
	public BuyerPortal_BusinessOnboardingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void basicBusinessDetailsPage(String filepath,String filepath1,String text1,String text2,String text3,String text4,String text5,String text6) throws InterruptedException, AWTException
	{   
//		reusable.click(companylogo);
//		Thread.sleep(2000);
//		reusable.click(changebutton);
//		Thread.sleep(2000);
		
		
		reusable.uploadrobot(companylogo, filepath);
		Thread.sleep(2000);
		reusable.click(applybutton);
		Thread.sleep(2000);
		reusable.uploadrobot(coverphoto, filepath1);
		Thread.sleep(2000);
		reusable.click(applybutton);
		Thread.sleep(2000);
		reusable.sendkeyss(entityname,text1);
		Thread.sleep(2000);
		reusable.sendkeyss(countryofincorporation,text2);
		reusable.arrowdown(countryofincorporation);
		Thread.sleep(2000);
		reusable.sendkeyss(CountryofOperation,text3);
		reusable.arrowdown(CountryofOperation);
		Thread.sleep(2000);
		reusable.sendkeyss(tin,text1);
		Thread.sleep(2000);
		reusable.clicking(Registrationcheckbox);
		Thread.sleep(2000);
		reusable.sendkeyss(doi, text4);
		Thread.sleep(2000);
		reusable.sendkeyss(companywebsite, text5);
		Thread.sleep(2000);
		reusable.click(PrimaryIndustry);
		Thread.sleep(2000);
		reusable.multipleArrowDown(PrimaryIndustry);
		Thread.sleep(2000);
		reusable.click(nextbutton);
//		reusable.doublearrowdown(PrimaryIndustry);
//		Thread.sleep(2000);
//		reusable.doublearrowdown(PrimaryIndustry);
//		Thread.sleep(2000);
//		reusable.click(coverphoto);
//		Thread.sleep(2000);
//		reusable.click(coverphoto);
//		Thread.sleep(2000);
		
		
	}
	public void contactDetailsPage(String filepath) throws InterruptedException, AWTException
	{   

	
	
	}
}