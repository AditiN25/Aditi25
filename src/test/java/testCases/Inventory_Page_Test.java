package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import base.Testbase;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.ReadData;
import utility.Screenshot;

public class Inventory_Page_Test extends Testbase
{
	LoginPage login;
	Inventory_Page invent;
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
		   intialization();
		   login =new LoginPage();
		   invent =new Inventory_Page();
		   login.logintoApplication();
	   }
    @Test
    public void verifySwagLabName()
    {
    	String explogo = "Swag Labs";
    	String actlogo = invent.verifySwagLabName();
    	Assert.assertEquals(explogo,actlogo);
    	Reporter.log("App logo is ="+actlogo);
    }
    @Test
    public void verifyBurgermenu()
    {
    	boolean result = invent.verifyBurgermenu();
    	Assert.assertEquals(result,true);
    	Reporter.log("Burgger menu is present ="+result);
    }
    @Test
    public void verifyTwitterlogo()
    {
        boolean result = invent.verifyTwitterlogo();
        Assert.assertEquals(result,true);
        Reporter.log("Twitter logo is present = "+ result);
    }
    @Test
    public void verifyFacebooklogo()
    {
    	boolean result = invent.verifyFacebooklogo();
    	Assert.assertEquals(result,true);
    	Reporter.log("Facebook logo is present ="+ result);
    }
    @Test
    public void verifyLinkdinlogo()
    {
    	boolean result = invent.verifyLinkdinlogo();
    	Assert.assertEquals(result,true);
    	Reporter.log("Linkdin logo is present ="+ result);
    }
    @Test
    public void add6Products() throws EncryptedDocumentException, IOException
    {
    	String expCount = ReadData.readExcel(0, 3); // "6"(0,3)
    	String actCount = invent.add6Products();
    	Assert.assertEquals(expCount,actCount);
    	Reporter.log("Total products add to cart =" +actCount);
    }
    @Test
    public void Footertext()
    {
    	String expText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
    	String actText = invent.FooterText();
    	Assert.assertEquals(expText,actText);
    	Reporter.log("Footer text is =" +actText);
    }
    @Test
    public void verifyInventoryPageTitle() throws EncryptedDocumentException, IOException
    {
    	String expTitle ="Products"; //(0,4)
    	String actTitle = invent.verifyInventoryPageTitle();
    	Assert.assertEquals(expTitle, actTitle);
    	Reporter.log("Inventory Page Title = " +actTitle);
    	
    }
    @Test
    public void removeproduct() throws EncryptedDocumentException, IOException
    {
    	String expCount ="4";//(0,5)
    	String actCount = invent.removeproduct();
    	Assert.assertEquals(expCount,actCount);
    	Reporter.log(actCount);
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