package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.Testbase;

public class Screenshot extends Testbase
{
   // date
	public static String getDate() 
	{
		return new SimpleDateFormat("dd-MM-YYYY ss-mm-HH").format(new Date());
		
	}
   // screenshot
	public static void cs(String nameOfMethod) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\pratik narkhede\\eclipse-workspace\\Selenium_Framework\\Screenshot\\"+nameOfMethod+"--"+getDate()+".jpeg");
	    FileHandler.copy(source, dest);
	}
}
