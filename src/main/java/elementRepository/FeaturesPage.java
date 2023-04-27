package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class FeaturesPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExplicitWaitClass exp=new ExplicitWaitClass();

	public FeaturesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header[@id='header']//ul[@class='nav navbar-nav nav-menu']//li//a[@href='#features']")
	WebElement featuresTab;
	
	
	@FindBy(xpath = "//section[@id='features']//div[@class='section-heading align-center mb-40']//h2")
	WebElement whatMakesGoPetsDifferentText;
	
	
	
	

	
	public void clickOnFeaturesTab() {
		exp.elementToBeClickableWait(featuresTab, driver);
		gu.clickElement(featuresTab);
	}
	
	public boolean iswhatMakesGoPetsDifferentTextVisibleOrNot() {
	    
		exp.presenceOfElementLocatedWaitById(driver, null);
		return gu.isDisplayedMethod(whatMakesGoPetsDifferentText);
	}
	
}


