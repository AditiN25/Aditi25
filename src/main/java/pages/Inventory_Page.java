package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Testbase;
import utility.Handle_Dropdown;

public class Inventory_Page extends Testbase 
{
   //object repository
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement SwagLabName;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement BurgerMenu;
    @FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement productBagPack;
    @FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']") private WebElement productBikeLight;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement productTshirt;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-fleece-jacket']") private WebElement productJacket;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-onesie']") private WebElement prosuctOnesie;
    @FindBy(xpath = "//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement productRedTShirt;
    
    @FindBy(xpath = "//span[@class='title']") private WebElement Title;
    
    @FindBy(xpath = "//a[text()='Twitter']") private WebElement Twitterlogo;
    @FindBy(xpath = "//a[text()='Facebook']") private WebElement Facebooklogo;
    @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement Linkdinlogo;
    
    @FindBy(xpath = "//div[@class='footer_copy']") private WebElement Footertext;
    
    @FindBy(xpath = "//select[@class='product_sort_container']") private WebElement Dropdown;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement Carticon;
    @FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement CartCount;
    
    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']") private WebElement RemoveBackpack;
    @FindBy(xpath = "//button[@name='remove-sauce-labs-bike-light']") private WebElement Removebikelight;
    //calling
    
    public Inventory_Page()
    {
    	PageFactory.initElements(driver, this);
    }
    
    //methods
    public String verifySwagLabName()
    {
    	return SwagLabName.getText();
    }
    public boolean verifyBurgermenu()
    {
    	return BurgerMenu.isDisplayed();
    }
    public String verifyInventoryPageTitle() 
    {
		return Title.getText();
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
    public String add6Products() 
    {
    	Handle_Dropdown.handleSelect(Dropdown,"Price (low to high)");
    	productBagPack.click();
    	productBikeLight.click();
    	productTshirt.click();
    	productJacket.click();
    	prosuctOnesie.click();
    	productRedTShirt.click();
		return CartCount.getText();
    }
    public String removeproduct()
    {
    	add6Products();
    	RemoveBackpack.click();
    	Removebikelight.click();
		return CartCount.getText();
    }
    public void clickOncart()
    {
    	Carticon.click();
    }
    public String FooterText()
    {
		return Footertext.getText();
    	
    }
}
