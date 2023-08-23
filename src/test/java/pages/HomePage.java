package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class HomePage extends testBase {
	
	@FindBy(name = "searchbar")
	WebElement srcBox;
	
	@FindBy(id ="button-search")
	WebElement srcBtn;
	
	@FindBy(id="cart")
	WebElement btnCart;
	 public HomePage() {
		 PageFactory.initElements(driver, this);
	 }
	 public void serachItem(String item) {
		 srcBox.sendKeys(item);
		 srcBtn.click();
		 
	 }
	public void navigateToCard() {
		btnCart.click();
	}

}
