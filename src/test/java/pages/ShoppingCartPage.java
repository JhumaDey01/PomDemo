package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class ShoppingCartPage extends testBase {
	
@FindAll(@FindBy(css ="ul>li"))
List<WebElement> items ;

@FindBy(xpath ="//button[contains(text(),'Checkout')]")
WebElement checkoutBtn;

public ShoppingCartPage() {
	PageFactory.initElements(driver, this);
}

public boolean isItemavailable() {
	if(items.size()>0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void checkoutButtonClick() {
	checkoutBtn.click();
	
}
}
