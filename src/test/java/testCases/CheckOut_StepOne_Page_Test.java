package testCases;

import static org.testng.Assert.expectThrows;

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
import pages.Inventory_Page;
import pages.LoginPage;
import utility.Screenshot;

public class CheckOut_StepOne_Page_Test extends Testbase
{
	LoginPage login;
	Inventory_Page invent;
	Cart_Page cart;
	CheckOut_StepOne_Page check;
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
		   intialization();
		   login =new LoginPage();
		   invent =new Inventory_Page();
		   check =new CheckOut_StepOne_Page();
		   cart=new Cart_Page();
		   login.logintoApplication();
		   invent.add6Products();
		   invent.clickOncart();
		   cart.clickonCheckOnBtn();
	   }
	   
	   @Test
	   public void verifyApplogonameTest()
	   {
		   String explogo = "Swag Labs";
	    	String actlogo = check.verifyAppLogo();
	    	Assert.assertEquals(explogo,actlogo);
	    	Reporter.log("App logo is ="+actlogo);
	   }
	   @Test
	   public void InputInformation()
	   {
		   String expUrl = "https://www.saucedemo.com/checkout-step-two.html";
		   String actUrl = check.InputInformation();
		   Assert.assertEquals(expUrl,actUrl);
		   Reporter.log("Input Information Is present = "+actUrl);
	   }
	   @Test
	   public void verifyCancleBtn()
	   {
		   String expUrl = "https://www.saucedemo.com/cart.html";
		   String actUrl = check.verifyCancleBtn();
		   Assert.assertEquals(expUrl, actUrl);
		   Reporter.log("Cancel button step on Url = "+actUrl);
	   }
	   @Test
	   public void verifyOpenMenu()
	   {
		   boolean result = check.verifyOpenMenu();
		   Assert.assertEquals(result,true);
		   Reporter.log("Open Menu is present = "+result);
	   }
	   @Test
	    public void verifyTwitterlogo()
	    {
	        boolean result = check.verifyTwitterlogo();
	        Assert.assertEquals(result,true);
	        Reporter.log("Twitter logo is present = "+ result);
	    }
	    @Test
	    public void verifyFacebooklogo()
	    {
	    	boolean result = check.verifyFacebooklogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Facebook logo is present = "+ result);
	    }
	    @Test
	    public void verifyLinkdinlogo()
	    {
	    	boolean result = check.verifyLinkdinlogo();
	    	Assert.assertEquals(result,true);
	    	Reporter.log("Linkdin logo is present = "+ result);
	    }
	    @Test
	    public void Footertext()
	    {
	    	String expText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
	    	String actText = check.verifyFooterText();
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
