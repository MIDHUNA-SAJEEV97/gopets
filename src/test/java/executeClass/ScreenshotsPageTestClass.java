package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.FeaturesPage;
import elementRepository.ScreenshotsPage;

import org.testng.annotations.Test;

public class ScreenshotsPageTestClass extends BaseClass {

	ScreenshotsPage sp;

	@Test(priority = 1)
	public void verifyScreenShotsTabIsClickableOrNot() throws InterruptedException {

		sp = new ScreenshotsPage(driver);

		sp.clickOnScreenShotsTab();
		Boolean actual = sp.isScreenShotPageDisplayed();
		Assert.assertTrue(actual);

	}

	@Test(priority = 2)
	public void verifyForwardArrowKeyClickableOrNot() throws InterruptedException {

		sp = new ScreenshotsPage(driver);
		sp.forwardArrowKeyClick();
		Boolean actual = sp.isScreenShotPageDisplayed();
		Assert.assertTrue(actual);

	}
}