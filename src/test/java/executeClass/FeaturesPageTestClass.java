package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.FeaturesPage;
import elementRepository.HomePage;

public class FeaturesPageTestClass extends BaseClass{

		
		 FeaturesPage fp;
		  @Test(priority=1)
		  public void verifyFeaturesTabIsClickableOrNot() throws InterruptedException {
			  
			  fp=new FeaturesPage(driver);
			 fp.clickOnFeaturesTab();
			  Boolean actual=fp.iswhatMakesGoPetsDifferentTextVisibleOrNot();
			  Assert.assertTrue(actual);  
		  
		}
		  @Test(priority=2)
		  public void verifywhatMakesGoPetsDifferentTextVisibleOrNot() throws InterruptedException {
			  
			  fp=new FeaturesPage(driver);
			 
			  Boolean actual=fp.iswhatMakesGoPetsDifferentTextVisibleOrNot();
			  Assert.assertTrue(actual);  
		  
		}
}