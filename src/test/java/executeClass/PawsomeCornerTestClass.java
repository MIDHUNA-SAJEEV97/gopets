package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.PawsomeCornerPage;
import elementRepository.TestimonialsPage;

import org.testng.annotations.Test;


	public class PawsomeCornerTestClass extends BaseClass {

		PawsomeCornerPage pp;

		@Test(priority = 1)
		public void verifypawsomeCornerTabIsClickableOrNot() throws InterruptedException {

			pp = new PawsomeCornerPage(driver);

			pp.clickOnPawsomeCornerTab();
			Boolean actual = pp.iscomingSoonTextVisibleOrNot();
			Assert.assertTrue(actual);

		}

		@Test(priority = 2)
		public void verifyiscomingSoonTextVisibleOrNot() throws InterruptedException {

			pp = new PawsomeCornerPage(driver);
			
			Boolean actual = pp.iscomingSoonTextVisibleOrNot();
			Assert.assertTrue(actual);

		}
	}
