package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class DownloadPage {
		WebDriver driver;
		GeneralUtilities gu = new GeneralUtilities();
		ExplicitWaitClass exp=new ExplicitWaitClass();

		public DownloadPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//div[@id='navbar']//a[text()='Download']")
		WebElement downloadTab;
		
		
		@FindBy(xpath = "//i[@class='fa fa-android']")
		WebElement androidLogo;
		
		
		
		public void clickOnDownloadTab() {
			exp.elementToBeClickableWait(downloadTab, driver);
			gu.clickElement(downloadTab);
		}
		public boolean isAndroidLogoDisplayed() throws InterruptedException {
			exp.presenceOfElementLocatedWaitByXpath(driver, null);
			return gu.isDisplayedMethod(androidLogo);
		
	}



}
