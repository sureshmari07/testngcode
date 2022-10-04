package BuyerPortal.qa.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import instrive.qa.testing.ReusableFunction;

public class BuyerPortal_SignInPage {
	private WebDriver driver;
	private ReusableFunction reusable;
	
	//private By joinus=By.xpath("//div[text()='Join Us']");
	//private By joinusnow =By.xpath("//span[text()='Join us now']");
	private By signin=By.xpath("//div[text()='Sign In']");
	private By googlelogin=By.xpath("//p[text()='Continue with Google']");
	private By email=By.xpath("//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input']");
	private By password=By.xpath("//input[@type='password']");
	private By checkboxclick=By.xpath("//input[@type='checkbox']");
	private By signinbutton=By.xpath("(//p[text()='Sign - In'])[2]");
	private By close=By.xpath("//*[@class='float-right']");

	public BuyerPortal_SignInPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
	public void signIn(String name1,String name2)
	{
	reusable.click(signin);
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.insertText(password,name2);
	reusable.click(checkboxclick);
	reusable.click(signinbutton);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//reusable.click(tableclick);
   
}
	
	public void signIn1(String name1,String name2)
	{
    reusable.clicking(close);	
	reusable.click(signin);;
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.insertText(password,name2);
	reusable.click(checkboxclick);
	reusable.click(signinbutton);
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//reusable.click(tableclick);
   // reusable.click(close);
}
	
	

}
