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
import pages.CheckOut_Complete;
import pages.CheckOut_StepOne_Page;
import pages.CheckOut_StepTwo_Page;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.Screenshot;

public class CheckOut_Complete_Test extends Testbase
{
	LoginPage login;
	Inventory_Page invent;
	Cart_Page cart;
	CheckOut_StepOne_Page check;
	CheckOut_StepTwo_Page check1;
	CheckOut_Complete finish;
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
		   intialization();
		   login =new LoginPage();
		   invent =new Inventory_Page();
		   check =new CheckOut_StepOne_Page();
		   check1=new CheckOut_StepTwo_Page();
		   finish=new CheckOut_Complete();
		   cart=new Cart_Page();
		   login.logintoApplication();
		   invent.add6Products();
		   invent.clickOncart();
		   cart.clickonCheckOnBtn();
		   check.InputInformation();
		   check1.clickonFinishBtn();
		   
	   }
	     @Test
	     public void verifyCompletePageURLName()
	   {
		     String expUrl = "https://www.saucedemo.com/checkout-complete.html";
		     String actURL = finish.verifyCompletePageURL();
		     Assert.assertEquals(expUrl, actURL);
		     Reporter.log("CheckOut complete URL is = "+actURL);
	   }
	   @Test
	   public void Applogoname()
	   {
		   String expText = "Swag Labs";
		   String actText = finish.Applogoname();
		   Assert.assertEquals(expText, actText);
		   Reporter.log("CheckOut Page URL = "+actText);
	   }
	   @Test
	   public void CheckOutCompleteTitle()
	   {
		   String expText = "Checkout: Complete!";
		   String actText = finish.CheckOutCompleteTitle();
		   Assert.assertEquals(expText, actText);
		   Reporter.log("CheckOutr Page Title = "+actText);
	   }
	   @Test
	   public void verifyThankYouText1()
	   {
		   String expText = "Thank you for your order!";
		   String actText = finish.verifyThankYouText1();
		   Assert.assertEquals(expText, actText);
		   Reporter.log("Thank YOU Text is present = "+actText);
	   }
	   @Test
	   public void verifyDispatchText()
	   {
		   String expText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		   String actText = finish.verifyDispatchText();
		   Assert.assertEquals(expText, actText);
		   Reporter.log("Dispatched Text is present = "+actText);
	   }
	   @Test
	   public void verifyBackHomeBtn()
	   {
		   String expText = "https://www.saucedemo.com/inventory.html";
		   String actText = finish.verifyBackHomeBtn();
		   Assert.assertEquals(expText, actText);
		   Reporter.log("BackHome button on Home URL =  "+actText);
	   }
	   @Test
	    public void verifyTwitterlogo()
	    {
	        boolean result = finish.verifyTwitterlogo();
	        Assert.assertEquals(result,true);
	        Reporter.log("Twitter logo is present = "+ result);
	    }
	   @Test
	    public void ImagePonyExpress()
	    {
	        boolean result = finish.ImagePonyExpress();
	        Assert.assertEquals(result,true);
	        Reporter.log("Image ponyExpress logo is present = "+ result);
	    }
	    @Test
	    public void verifyFacebooklogo()
	    {
	    	boolean result = finish.verifyFacebooklogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Facebook logo is present = "+ result);
	    }
	    @Test
	    public void verifyLinkdinlogo()
	    {
	    	boolean result = finish.verifyLinkdinlogo();
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
