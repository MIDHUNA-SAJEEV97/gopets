package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DownloadPage;
import elementRepository.HomePage;

import org.testng.annotations.Test;


	public class DownloadPageTestClass extends BaseClass {
		
		 DownloadPage dp;
		  @Test(priority=1)
		  public void verifyTheDownloadtabIsClickableOrNot() throws InterruptedException {
			  
			  dp=new DownloadPage(driver);
			 dp.clickOnDownloadTab();
			  Boolean actual=dp.isAndroidLogoDisplayed();
			  Assert.assertTrue(actual);  
		  
		}
		  @Test(priority=2)
		  public void verifyAndroidLogoDisplayedOrNot() throws InterruptedException {
			  
			  dp=new DownloadPage(driver);
			 
			  Boolean actual=dp.isAndroidLogoDisplayed();
			  Assert.assertTrue(actual);  
		  
		}
	}