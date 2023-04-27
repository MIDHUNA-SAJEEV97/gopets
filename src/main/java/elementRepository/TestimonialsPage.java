package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class TestimonialsPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExplicitWaitClass exp=new ExplicitWaitClass();

	public TestimonialsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header[@id='header']//a[text()='Testimonials']")
	WebElement testimonialsTab;
	
	
	@FindBy(xpath = "//section[@id='testimonial']")
	WebElement testimonialText;
	
	
	
	public void clickOnTestimonialsTab() {
		exp.elementToBeClickableWait(testimonialsTab, driver);
		gu.clickElement(testimonialsTab);
	}
	public boolean isTestimonialTextDisplayed() throws InterruptedException {
		exp.presenceOfElementLocatedWaitByXpath(driver,null);
		return gu.isDisplayedMethod(testimonialText);
	
}



}
