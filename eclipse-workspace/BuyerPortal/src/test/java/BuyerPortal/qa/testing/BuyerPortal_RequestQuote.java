package BuyerPortal.qa.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortal_RequestQuote {

	private WebDriver driver;
	private ReusableFunction reusable;
	

	private By requestquote=By.xpath("//button/p[text()='Request Quote']");
	private By companyname=By.xpath("//input[@placeholder='Company Name' and @type='text']");
	private By quantity=By.xpath("(//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input'])[2]");
	private By incoterms=By.xpath("//div[@role='button']");
	private By incotermsselect=By.xpath("//ul[@role='listbox']/li");
	private By destination=By.xpath("(//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input'])[3]");
	private By requirements=By.xpath("//textarea[@placeholder='Type your message here']");
	private By send1=By.xpath("//button/p[text()='Send']");
	
	
	
	
	
	
	
	public BuyerPortal_RequestQuote(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
	
	
	public void requestQuote(String companynam,String quantiti,String incoterm,String destinatio,String requiremnt)
	{
	reusable.click(requestquote);
	reusable.insertText(companyname, companynam);
	reusable.insertText(quantity, quantiti);
	reusable.clicking(incoterms);
	reusable.selectDropdown(incotermsselect, incoterm);
	//reusable.arrowdown(incoterms);
	reusable.insertText(destination, destinatio);
	reusable.insertText(requirements, requiremnt);
	reusable.click(send1);
	
	}
	
}
