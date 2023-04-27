package elementRepository;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;



public class HomePage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExplicitWaitClass exp=new ExplicitWaitClass();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeTab;
	
	
	@FindBy(xpath = "(//a[@href='#'])[1]")
	WebElement logo;
	
	
	
	

	public boolean isHomePageDisplayed() throws InterruptedException {
	  
		return gu.isDisplayedMethod(homeTab);
	}
	public void clickOnHomeButton() {
		
		exp.elementToBeClickableWait(homeTab, driver);
		gu.clickElement(homeTab);
	}
	
	public boolean isLogoDisplayed() {
		exp.presenceOfElementLocatedWaitByXpath(driver, null);
		return gu.isDisplayedMethod(logo);
	}
	
}
