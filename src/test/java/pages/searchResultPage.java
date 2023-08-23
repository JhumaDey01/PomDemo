package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class searchResultPage extends testBase {
	
	@FindBy(xpath ="//div[@class='preview-title']")
	WebElement srcResult;
	
	@FindBy(xpath ="//button[contains(text(),'Add to cart')]")
	WebElement addToCardbtn;
	
	public searchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchResult() {
		srcResult.click();
		
	}
	public void addToCardBtnClick() {
		addToCardbtn.click();
	}
	

	
}
