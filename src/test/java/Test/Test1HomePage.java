package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.page1Home;

public class Test1HomePage extends TestBase{
	
	page1Home login;   
	
	@BeforeMethod 
	public void setup() throws Exception
	{
		initalization();
		login = new page1Home();
	}
	
//	@Test(enabled=true)
//	public void testCartlogo()
//	{
//	  boolean result = login.cartlogo();
//	  Assert.assertEquals(result, true);
//	}
	
	@Test
	public void testmacATCbutton()
	{
		login.cartlogo();
	}

	
	@Test(enabled=false)
	public void testmacphoto()
	{
		boolean result1 = login.macphotos();
	}
	
	@Test(enabled=false)
	public void testiphonephotos()
	{
		boolean result2 = login.iphonephotos();
	}
	
	@Test(enabled=false)
	public void testapplephotos()
	{
		boolean result3 = login.applephotos();
	}
	
	@Test(enabled=false)
	public void testcanonphotos()
	{
		boolean result4 =  login.canonphotos();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
