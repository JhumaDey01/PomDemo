package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.testBase;

public class PlaceOrderTest extends testBase {
	HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		Initialize();
	}
	@Test
	public void searchItemTest() {
		homePage = new HomePage();
		homePage.serachItem("Parry Hotter");
		
		
	}
	@Test
	public void addToCardTest() {
		
	}
	@Test
	public void checkoutTest() {
		
	}

}
