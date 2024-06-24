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
import pages.Inventory_Page;
import pages.LoginPage;
import utility.Screenshot;

public class CartPage_Test extends Testbase
{
	LoginPage login;
	Inventory_Page invent;
	Cart_Page cart;
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
		   intialization();
		   login =new LoginPage();
		   invent =new Inventory_Page();
		   cart=new Cart_Page();
		   login.logintoApplication();
		   invent.add6Products();
		   invent.clickOncart();
	   }
	   @Test
	   public void verifycartUrlTest()
	   {
		   String expURL = "https://www.saucedemo.com/cart.html";
	    	String actURL = cart.verifycartUrl();
	    	Assert.assertEquals(expURL,actURL);
	    	Reporter.log("Cart Page Url is ="+actURL);
	   }
	   @Test
	   public void verifyApplogonameTest()
	   {
		   String explogo = "Swag Labs";
	    	String actlogo = cart.verifyApplogo();
	    	Assert.assertEquals(explogo,actlogo);
	    	Reporter.log("App logo is ="+actlogo);
	   }
	   @Test
	   public void verifyTitleOfYourCartTest()
	   {
		    String expTitle = "Your Cart";
	    	String actTitle = cart.verifyTitleOfYourCart();
	    	Assert.assertEquals(expTitle,actTitle);
	    	Reporter.log("Cart Page Title is ="+actTitle);
	   }
	   @Test
	   public void QuantityCartTest()
	   {
		    String exptext = "QTY";
	    	String acttext = cart.QuantityCart();
	    	Assert.assertEquals(exptext,acttext);
	    	Reporter.log("QTY text is present ="+acttext);
	   }@Test
	   public void DescriptionCartTest()
	   {
		   String exptext = "Description";
	    	String acttext = cart.DescriptionCart();
	    	Assert.assertEquals(exptext,acttext);
	    	Reporter.log("Description Text is present ="+acttext);
	   }
	   @Test
	   public void ContinueShoppingCartTest()
	   {
		   String expUrl = "https://www.saucedemo.com/inventory.html";
	    	String actUrl = cart.ContinueShoppingCart();
	    	Assert.assertEquals(expUrl,actUrl);
	    	Reporter.log("Continue Shopping step one URL ="+actUrl);
	   }
	   @Test
	   public void clickonCheckOnBtnTest()
	   {
		   String expURL = "https://www.saucedemo.com/checkout-step-one.html";
	    	String actURL = cart.clickonCheckOnBtn();
	    	Assert.assertEquals(expURL,actURL);
	    	Reporter.log("Checkout page step one URL ="+actURL);
	   }
	   @Test
	    public void verifyTwitterlogoTest()
	    {
	        boolean result = cart.verifyTwitterlogo();
	        Assert.assertEquals(result,true);
	        Reporter.log("Twitter logo is present = "+ result);
	    }
	    @Test
	    public void verifyFacebooklogoTest()
	    {
	    	boolean result = cart.verifyFacebooklogo();
	       Assert.assertEquals(result,true);
	    	Reporter.log("Facebook logo is present ="+ result);
	    }
	    @Test
	    public void verifyLinkdinlogoTest()
	    {
	     	boolean result = cart.verifyLinkdinlogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Linkdin logo is present ="+ result);
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
