package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class CheckOut_StepTwo_Page extends Testbase
{
    //Object Repository
	
	   @FindBy(xpath = "//div[@class='app_logo']") private WebElement Applogoname;
	   @FindBy(xpath = "//span[text()='Your Cart']") private WebElement TitleOfYourCart;
	   @FindBy(xpath = "//span[text()='Checkout: Overview']") private WebElement CheckOutOverview;
	   @FindBy(xpath = "//div[text()='QTY']") private WebElement QuantityCart;
	   @FindBy(xpath = "//div[text()='Description']") private WebElement DescriptionCart;
	   
	   @FindBy(xpath = "//div[text()='Sauce Labs Backpack']") private WebElement ProdBackpack;
	   @FindBy(xpath = "//div[@class='inventory_item_desc']") private WebElement BackpackText;
	 //  @FindBy(xpath = "//div[@class='inventory_item_price']") private WebElement BackpackPrice;
	   @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']") private WebElement ProdBikeLight;
	   //@FindBy(xpath = "//div[@class='inventory_item_desc']") private WebElement BikeLightText;
	   //@FindBy(xpath = "//div[@class='inventory_item_price']") private WebElement BikeLightPrice;
	   
	   @FindBy(xpath = "//div[text()='Payment Information:']") private WebElement PaymentInfo;
	   @FindBy(xpath = "//div[text()='SauceCard #31337']") private WebElement SauceCard;
	   @FindBy(xpath = "//div[text()='Shipping Information:']") private WebElement ShippingInfo;
	   @FindBy(xpath = "//div[text()='Free Pony Express Delivery!']") private WebElement ExpressDelivery;
	   @FindBy(xpath = "//div[text()='Price Total']") private WebElement Pricetotal;
	   @FindBy(xpath = "//div[contains(@class,'summary_subtotal_label')]") private WebElement SubtotalLabel;
	   @FindBy(xpath = "//div[@class='summary_tax_label']") private WebElement TaxLabel;
	   @FindBy(xpath = "//div[@class='summary_total_label']") private WebElement TotalLabel;
	   
	   @FindBy(xpath = "//a[text()='Twitter']") private WebElement Twitterlogo;
	    @FindBy(xpath = "//a[text()='Facebook']") private WebElement Facebooklogo;
	    @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement Linkdinlogo;
		@FindBy(xpath = "//div[@class='footer_copy']") private WebElement FooterText;
		
	   @FindBy(xpath = "//button[@id='cancel']") private WebElement CancleBtn;
	   @FindBy(xpath = "//button[@id='finish']") private WebElement FinishBtn;
	  

// calling
     public CheckOut_StepTwo_Page()
    {
	PageFactory.initElements(driver,this);
    }
     
     //methods
     public String verifystepTwoUrlTest()
     {
		return driver.getCurrentUrl();
    	 
     }
     public String verifyApplogoname()
     {
    	 return Applogoname.getText();
     }
     public String verifyTitleOfYourCart()
     {
    	return TitleOfYourCart.getText();
     }
     public String CheckOutOverview()
     {
		return CheckOutOverview.getText();
     }
     public String verifyQuantityCart()
     {
    	return QuantityCart.getText();
     }
     public String verifyDescriptionCart()
     {
    	return DescriptionCart.getText();
     }
     public String verifyProdBackpack()
     {
		return ProdBackpack.getText();
    	 
     }
     public String verifyBackpackText()
     {
		return BackpackText.getText();
    	 
     } /*
     public String verifyBickpackPrice()
     {
		return BickpackPrice.getText();
    	 
     } */
     public String verifyProdBikeLight()
     {
		return ProdBikeLight.getText(); 
     } 
    /* public String verifyBikeLightText()
     {
		return BikeLightText.getText();  	 
     }
     public String verifyBakeLightPrice()
     {
		return BakeLightPrice.getText();  	 
     }*/ 
     public String verifyPaymentInfo()
     {
		return PaymentInfo.getText(); 
     } 
     public String verifySauceCard()
     {
		return SauceCard.getText();    	 
     }
     public String verifyShippingInfo()
     {
		return ShippingInfo.getText();   	 
     }
     public String verifyExpressDelivery()
     {
		return ExpressDelivery.getText();  	 
     }
     public String verifyPricetotal()
     {
		return Pricetotal.getText();
    	 
     }
     public String verifySubtotalLabel()
     {
		return SubtotalLabel.getText(); 
     }
     public String verifyTaxLabel()
     {
		return TaxLabel.getText(); 
     }
     public String verifyTotalLabel()
     {
		return TotalLabel.getText(); 
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
     public String CancleBtn()
     {
    	 CancleBtn.click();
		return driver.getCurrentUrl();
     }
     public String clickonFinishBtn()
     {
    	 FinishBtn.click();
		return driver.getCurrentUrl();
     }
     
     
     
     
     
     
}