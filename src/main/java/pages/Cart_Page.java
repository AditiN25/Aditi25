package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Cart_Page extends Testbase
{
    //object repository
   @FindBy(xpath = "//div[@class='app_logo']") private WebElement Applogo;
   @FindBy(xpath = "//span[text()='Your Cart']") private WebElement TitleOfYourCart;
   @FindBy(xpath = "//div[text()='QTY']") private WebElement QuantityCart;
   @FindBy(xpath = "//div[text()='Description']") private WebElement DescriptionCart;
   @FindBy(xpath = "//button[@id='continue-shopping']") private WebElement ContinueShoppingCart;
   @FindBy(xpath = "//button[@id='checkout']") private WebElement CheckoutBtn;
   
   @FindBy(xpath = "//a[text()='Twitter']") private WebElement TwitterlogoCart;
   @FindBy(xpath = "//a[text()='Facebook']") private WebElement FacebooklogoCart;
   @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement LinkdinlogoCart;
  
   //calling
 public Cart_Page()
 {
	 PageFactory.initElements(driver, this);
 }
 //method
 public String verifycartUrl()
 {
	return driver.getCurrentUrl();
 }
 public String verifyApplogo()
 {
	 return Applogo.getText();
 }
 public String verifyTitleOfYourCart()
 {
	return TitleOfYourCart.getText();
 }
 public String QuantityCart()
 {
	return QuantityCart.getText();
 }
 public String DescriptionCart()
 {
	return DescriptionCart.getText();
 }
 public String ContinueShoppingCart()
 {
	ContinueShoppingCart.click();
	return driver.getCurrentUrl();
 }
 public String clickonCheckOnBtn()
 {
	 CheckoutBtn.click();
	return driver.getCurrentUrl();
 }
 public boolean verifyTwitterlogo()
 {
		return TwitterlogoCart.isDisplayed();
 }
 public boolean verifyFacebooklogo()
 {
		return FacebooklogoCart.isDisplayed();
 }
 public boolean verifyLinkdinlogo()
 {
		return LinkdinlogoCart.isDisplayed();
 }
}
