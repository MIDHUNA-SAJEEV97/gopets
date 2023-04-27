package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ScreenshotsPage;
import elementRepository.TestimonialsPage;

import org.testng.annotations.Test;

public class TestimonialsPageTestClass extends BaseClass {

	TestimonialsPage tp;

	@Test(priority = 1)
	public void verifyScreenShotsTabIsClickableOrNot() throws InterruptedException {

		tp = new TestimonialsPage(driver);

		tp.clickOnTestimonialsTab();
		Boolean actual = tp.isTestimonialTextDisplayed();
		Assert.assertTrue(actual);

	}

	@Test(priority = 2)
	public void verifyForwardArrowKeyClickableOrNot() throws InterruptedException {

		tp = new TestimonialsPage(driver);
		
		Boolean actual = tp.isTestimonialTextDisplayed();
		Assert.assertTrue(actual);

	}
}