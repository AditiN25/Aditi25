package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class CheckOut_StepOne_Page extends Testbase
{
    // Object Repository
	

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement Applogo;
	@FindBy(xpath = "//span[text()='Checkout: Your Information']") private WebElement CheckOutYourInfo;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement OpenMenu;
	@FindBy(xpath = "//button[@id='cancel']") private WebElement CancleBtn;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement Twitterlogo;
    @FindBy(xpath = "//a[text()='Facebook']") private WebElement Facebooklogo;
    @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement Linkdinlogo;
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement FooterText;
	
	@FindBy(xpath = "//input[@id='first-name']") private WebElement FirstNameTxtBox;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement LastNameTctBox;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement PostalCodTxtBox;
	@FindBy(xpath = "//input[@id='continue']") private WebElement ContinueBtn;
	
	//calling
	public CheckOut_StepOne_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public String InputInformation()
	{
		FirstNameTxtBox.sendKeys("Aditi");
		LastNameTctBox.sendKeys("Narkhede");
		PostalCodTxtBox.sendKeys("440013");
		ContinueBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyAppLogo()
	{
		return Applogo.getText() ;
		
	}
	public String verifyCheckYourInfo()
	{
		return CheckOutYourInfo.getText();
	}
	public boolean verifyOpenMenu()
	{
		return OpenMenu.isDisplayed();
		
	}
	public String verifyCancleBtn()
	{
		 CancleBtn.click();
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
	public void ContinueBtn() 
	{
		ContinueBtn.click();
		
	}
	
}
