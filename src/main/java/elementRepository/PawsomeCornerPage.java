package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class PawsomeCornerPage {
	
		WebDriver driver;
		GeneralUtilities gu = new GeneralUtilities();
		ExplicitWaitClass exp=new ExplicitWaitClass();

		public PawsomeCornerPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//li[@class='active']//a")
		WebElement PawsomeCornerTab;
		
		
		@FindBy(xpath = "(//div[@class='post_content']//a[@class='read_more_btn'])[1]")
		WebElement comingSoonText;
		
		
		
		

		
		public void clickOnPawsomeCornerTab() {
			exp.elementToBeClickableWait(PawsomeCornerTab, driver);
			gu.clickElement(PawsomeCornerTab);
		}
		
		public boolean iscomingSoonTextVisibleOrNot() {
		    
			exp.presenceOfElementLocatedWaitById(driver, null);
			return gu.isDisplayedMethod(comingSoonText);
		}
		
	}




