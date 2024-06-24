package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class CheckOut_Complete extends Testbase
{
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement Applogoname;
	@FindBy(xpath = "//span[text()='Checkout: Complete!']") private WebElement CheckOutCompleteTitle;
	@FindBy(xpath = "//h2[text()='Thank you for your order!']") private WebElement ThankYouText;
	@FindBy(xpath = "//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']") private WebElement DispatchText;
	@FindBy(xpath = "//button[text()='Back Home']") private WebElement BackHomeBtn;
	
	@FindBy(xpath = "//img[@class='pony_express']") private WebElement ImagePonyExpress;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement Twitterlogo;
    @FindBy(xpath = "//a[text()='Facebook']") private WebElement Facebooklogo;
    @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement Linkdinlogo;
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement FooterText;
	
	// calling
	public CheckOut_Complete()
	{
		PageFactory.initElements(driver,this);
	}
    //methods
	public String verifyCompletePageURL()
	{
		return driver.getCurrentUrl();
		
	}
	public String Applogoname()
	{
		return Applogoname.getText();	
	}
	public String CheckOutCompleteTitle()
	{
		return CheckOutCompleteTitle.getText();
	}
	public String verifyThankYouText1()
	{
		return ThankYouText.getText();
		
	}
	public String verifyDispatchText()
	{
		return DispatchText.getText();
		
	}
	public boolean ImagePonyExpress()
	{
		return ImagePonyExpress.isDisplayed();
		
	}
	public String verifyBackHomeBtn()
	{
		BackHomeBtn.click();
		return driver.getCurrentUrl();
	}
	
	public boolean verifyTwitterlogo()
	{
		return Twitterlogo.isDisplayed();
		
	}
	public boolean verifyFacebooklogo()
	{
		return Facebooklogo.isDisplayed();
		
	}
	public boolean verifyLinkdinlogo()
	{
		return Linkdinlogo.isDisplayed();
		
	}
	public String verifyFooterText()
	{
		return FooterText.getText();	
	}
}
