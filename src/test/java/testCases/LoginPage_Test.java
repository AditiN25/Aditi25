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
import pages.LoginPage;
import utility.ReadData;
import utility.Screenshot;

public class LoginPage_Test extends Testbase
{    
	LoginPage login;
   @BeforeMethod
   public void setUp() throws IOException
   {
	   intialization();
	   login =new LoginPage();
   }
   @Test
   public void logintoApplicationTest() throws IOException
   {
	   String expURL=ReadData.readExcel(0,0);  // https://www.saucedemo.com/inventory.html (0,0)
	   String actURL=login.logintoApplication();
	   Assert.assertEquals(expURL,actURL);
	   Reporter.log("The URL OF Swag Lab = " + actURL);
   }
   @Test
   public void verifyOfURLApplicationTest() throws EncryptedDocumentException, IOException
   {
	   String expURL=ReadData.readExcel(0,1);  // "https://www.saucedemo.com/" (0,1)
	   String actURL=login.verifyOfURLApplication();
	   Assert.assertEquals(expURL,actURL);
	   Reporter.log("Login Successfully = "+ actURL );
   }
   @Test
   public void verifyOfTitleApplicationTest() throws EncryptedDocumentException, IOException
   {
	   String expTitle="Swag Labs";   //ReadData.readExcel(0, 2); (0,2)
	   String actTitle=login.verifyOfTitleApplication();
	   Assert.assertEquals(expTitle,actTitle);
	   Reporter.log("Verify Successfully = "+ actTitle);
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
