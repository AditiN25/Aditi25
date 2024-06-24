package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Cart_Page;
import pages.CheckOut_StepOne_Page;
import pages.CheckOut_StepTwo_Page;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.Screenshot;

public class CheckOut_StepTwo_Page_Test extends Testbase
{
	LoginPage login;
	Inventory_Page invent;
	Cart_Page cart;
	CheckOut_StepOne_Page check;
	CheckOut_StepTwo_Page check1;
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
		   intialization();
		   login =new LoginPage();
		   invent =new Inventory_Page();
		   check =new CheckOut_StepOne_Page();
		   check1=new CheckOut_StepTwo_Page();
		   cart=new Cart_Page();
		   login.logintoApplication();
		   invent.add6Products();
		   invent.clickOncart();
		   cart.clickonCheckOnBtn();
		   check.InputInformation();
	   }
	   
	   @Test
	   public void verifystepTwoUrlTest()
	   {
		   String expURL = "https://www.saucedemo.com/checkout-step-two.html";
	    	String actURL = check1.verifystepTwoUrlTest();
	    	Assert.assertEquals(expURL,actURL);
	    	Reporter.log("CheckOut_Two Page Url is = "+actURL);
	   }
	   @Test
	   public void verifyApplogoname1()
	   {
		    String explogo = "Swag Labs";
	    	String actlogo = check1.verifyApplogoname();
	    	Assert.assertEquals(explogo,actlogo);
	    	Reporter.log("App logo is = "+actlogo);
	   }
	   @Test
	   public void CheckOutOverview()
	   {
		    String expTitle = "Checkout: Overview";
	    	String actTitle = check1.CheckOutOverview();
	    	Assert.assertEquals(expTitle,actTitle);
	    	Reporter.log("CheckoutstepTWO Title Of Page is = "+actTitle);
	   }
	   @Test
	   public void verifyQuantityCart()
	   {
		    String expText = "QTY";
	    	String actText = check1.verifyQuantityCart();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("QTY Text is present = "+actText);
	   }
	   @Test
	   public void verifyDescriptionCart()
	   {
		    String expText = "Description";
	    	String actText = check1.verifyDescriptionCart();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Description Text is present = "+actText);
	   }
	   @Test
	   public void verifyProdBackpack()
	   {
		    String expText = "Sauce Labs Backpack";
	    	String actText = check1.verifyProdBackpack();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Selected Product is = "+actText);
	   }
	   @Test
	   public void verifyBackpackText()
	   {
		    String expText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
	    	String actText = check1.verifyBackpackText();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Selected Product Text is  = "+actText);
	   }
	   /*@Test
	   public void verifyBackpackPrice()
	   {
		   String expText = "$29.99";
	    	String actText = check1.verifyBackpackText();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Price of Selected Product is = "+actText);
	   }*/
	   @Test
	   public void verifyProdBikeLight()
	   {
		   String expText = "Sauce Labs Bike Light";
	    	String actText = check1.verifyProdBikeLight();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Selected product Name is = "+actText);
	   }
	   /*@Test
	   public void verifyBikeLightText()
	   {
		   String expText = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
	    	String actText = check1.verifyBikeLightText();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Selected Product Text = "+actText);
	   }
	   @Test
	   public void verifyBakeLightPrice()
	   {
		   String expText = "$9.99";
	    	String actText = check1.verifyBakeLightPrice();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Price of Selected Product = "+actText);
	   }*/
	   @Test
	   public void verifyPaymentInfo()
	   {
		    String expText = "Payment Information:";
	    	String actText = check1.verifyPaymentInfo();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Payment Info is = "+actText);
	   }
	   @Test
	   public void verifySauceCard()
	   {
		   String expText = "SauceCard #31337";
	    	String actText = check1.verifySauceCard();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("SauceCard is = "+actText);
	   }
	   @Test
	   public void verifyShippingInfo()
	   {
		   String expText = "Shipping Information:";
	    	String actText = check1.verifyShippingInfo();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Information of Shipping is = "+actText);
	   }
	   @Test
	   public void verifyExpressDelivery()
	   {
		   String expText = "Free Pony Express Delivery!";
	    	String actText = check1.verifyExpressDelivery();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Express Delivery is = "+actText);
	   }
	   @Test
	   public void verifyPricetotal()
	   {
		   String expText = "Price Total";
	    	String actText = check1.verifyPricetotal();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Price Total is = "+actText);
	   }
	   @Test
	   public void verifySubtotalLabel()
	   {
		   String expText = "Item total: $129.94";
	    	String actText = check1.verifySubtotalLabel();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Subtotal Label is = "+actText);
	   }
	   @Test
	   public void verifyTaxLabel()
	   {
		   String expText = "Tax: $10.40";
	    	String actText = check1.verifyTaxLabel();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("TaxLabel is = "+actText);
	   }
	   @Test
	   public void verifyTotalLabel()
	   {
		   String expText = "Total: $140.34";
	    	String actText = check1.verifyTotalLabel();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("TotalLabel is = "+actText);
	   }
	   @Test
	    public void verifyTwitterlogo()
	    {
	        boolean result = check1.verifyTwitterlogo();
	        Assert.assertEquals(result,true);
	        Reporter.log("Twitter logo is present = "+ result);
	    }
	    @Test
	    public void verifyFacebooklogo()
	    {
	    	boolean result = check1.verifyFacebooklogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Facebook logo is present = "+ result);
	    }
	    @Test
	    public void verifyLinkdinlogo()
	    {
	    	boolean result = check1.verifyLinkdinlogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Linkdin logo is present = "+ result);
	    }
	    @Test
	    public void Footertext()
	    {
	    	String expText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
	    	String actText = check1.verifyFooterText();
	    	Assert.assertEquals(expText,actText);
	    	Reporter.log("Footer text is = " +actText);
	    }
	   @Test
	   public void CancleBtn()
	   {
		   String expURL = "https://www.saucedemo.com/inventory.html";
	    	String actURL = check1.CancleBtn();
	    	Assert.assertEquals(expURL,actURL);
	    	Reporter.log("Checkout StepTwo btton on cancel url = "+actURL);
	   }
	   @Test
	   public void clickonFinishBtn()
	   {
		   String expURL = "https://www.saucedemo.com/checkout-complete.html";
	    	String actURL = check1.clickonFinishBtn();
	    	Assert.assertEquals(expURL,actURL);
	    	Reporter.log("Checkout StepTwo button on finish url = "+actURL);
	   }
	   
	   @AfterMethod
	    public void closeBrowser(ITestResult it) throws IOException
	    {
	 	   if(it.FAILURE==it.getStatus())
	 	   {
	 		   Screenshot.cs(it.getName());
	 	   }
	 	     
	 	   driver.close();
	    }
}
