package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ShoppingCartPage;
import pages.searchResultPage;
import testBase.testBase;

public class PlaceOrderTest extends testBase {
	HomePage homePage;
	searchResultPage srcPage;
	ShoppingCartPage cartPage;
	
	@BeforeTest
	public void setUp() {
		Initialize();
	}
	@Test(priority = 0)
	public void searchItemTest() {
		homePage = new HomePage();
		srcPage = new searchResultPage();
		homePage.serachItem("Parry Hotter");
		srcPage.searchResult();
		
		
	}
	@Test(priority =1)
	public void addToCardTest() {
		srcPage = new searchResultPage();
		srcPage.addToCardBtnClick();
		
	}
	@Test(priority =2)
	public void checkoutTest() {
		cartPage = new ShoppingCartPage();
		boolean isitemAvailable = cartPage.isItemavailable();
		if(isitemAvailable)
		{
			cartPage.checkoutButtonClick();
		}
		
		
	}

}
