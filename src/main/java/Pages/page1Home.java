package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class page1Home extends TestBase {

	//Object Repository
	@FindBy(xpath = "//img[@src='https://demo.opencart.com/image/catalog/opencart-logo.png']")private WebElement Logo;
    @FindBy(xpath = "//img[@src='https://demo.opencart.com/image/cache/catalog/demo/macbook_1-200x200.jpg']")private WebElement macphoto;
	@FindBy(xpath = "//img[@src='https://demo.opencart.com/image/cache/catalog/demo/iphone_1-200x200.jpg']") private WebElement iphonephoto;
	@FindBy(xpath = "//img[@src='https://demo.opencart.com/image/cache/catalog/demo/apple_cinema_30-200x200.jpg']") private WebElement applephoto;
	@FindBy(xpath = "//img[@src='https://demo.opencart.com/image/cache/catalog/demo/canon_eos_5d_1-200x200.jpg']") private WebElement canonphoto;
     
	@FindBy(xpath = "(//button[@type='submit'])[2]")private WebElement macATC;
	
	@FindBy(xpath = "(//button[@aria-label='Add to Cart'])[2]") private WebElement iphone;
	@FindBy(xpath = "(//button[@aria-label='Add to Cart'])[3]") private WebElement apple;
	@FindBy(xpath = "(//button[@aria-label='Add to Cart'])[4]") private WebElement canon;
	
	
	public  page1Home()
	{
	 PageFactory.initElements(driver, this);
	}

	public  void cartlogo()
	{
		macATC.click();
	    //return Logo.isDisplayed();
	}

	public boolean macphotos()
	{
		return macphoto.isDisplayed();
	}
	
	public boolean iphonephotos()
	{
		return iphonephoto.isDisplayed();
	}
	
	public boolean applephotos()
	{
		return applephoto.isDisplayed();
	}
	
	public boolean canonphotos()
	{
		return canonphoto.isDisplayed();
	}
	
//	public  boolean MacATC()
//	{
//		macbook.click();
//		return false;
//	}
	
	

	
	
	
	
	
	
	
	

}
