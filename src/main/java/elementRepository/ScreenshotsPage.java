package elementRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class ScreenshotsPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExplicitWaitClass exp=new ExplicitWaitClass();

	public ScreenshotsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='navbar']//a[text()='Screenshots']")
	WebElement screenShotsTab;
	
	
	@FindBy(xpath = "//i[@class=' arrow_carrot-right']")
	WebElement forwardArrowKey;
	
	
	
	public void clickOnScreenShotsTab() {
		exp.elementToBeClickableWait(screenShotsTab, driver);
		gu.clickElement(screenShotsTab);
	}
	public boolean isScreenShotPageDisplayed() {
		exp.presenceOfElementLocatedWaitByXpath(driver, null);
		return gu.isDisplayedMethod(forwardArrowKey);
	}
	
	public void forwardArrowKeyClick() {
		
		exp.elementToBeClickableWait(forwardArrowKey, driver);
		gu.clickElement(forwardArrowKey);
	}
	
}


