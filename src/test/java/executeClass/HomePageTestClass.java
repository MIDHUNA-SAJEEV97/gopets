package executeClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class HomePageTestClass extends BaseClass {
		
	 HomePage lp;
	  @Test(priority=2)
	  public void verifyTheHomePageDisplayedWhileHittingTheUrl() throws InterruptedException {
		  
		  lp=new HomePage(driver);
		 
		 String actual="https://test4dtg.tltechnologies.net/#home";
		  String expected="https://test4dtg.tltechnologies.net/#home";
		  Assert.assertEquals(actual,expected);  
	  
	}
	  @Test(priority=3)
	  public void verifyTheHomePageLogoDisplayedOrNot() throws InterruptedException {
		  
		  lp=new HomePage(driver);
		 
		  Boolean actual=lp.isLogoDisplayed();
		  Assert.assertTrue(actual);  
	  
	}
	  @Test(priority=1)
	  public void verifyTheHomeTabIsClickableOrNot() throws InterruptedException {
		  
		  lp=new HomePage(driver);
		 
		  Boolean actual=lp.isLogoDisplayed();
		  Assert.assertTrue(actual);  
	  
	}
	}	 
