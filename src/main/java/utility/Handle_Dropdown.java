package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown 
{
     public static void handleSelect(WebElement ele,String value)
     {
    	 Select s=new Select(ele); //Webelement
    	 s.selectByVisibleText(value);
    	 
    	 
     }
}
