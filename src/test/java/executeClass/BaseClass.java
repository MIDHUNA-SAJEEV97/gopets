package executeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenShotsClass;

public class BaseClass {
	WebDriver driver;
	ScreenShotsClass sh;
	
	public static Properties property;          //to read data
	
	public static void readProperty() throws IOException {
		
	property=new Properties();
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties");
	property.load(file);
	
	}
	
	@BeforeSuite(alwaysRun=true)
	public void createReport(final ITestContext testContext) {
		  ExtentReport.ExtendManager.createInstance().createTest(testContext.getName(), "message");
	  }
	
	
	
	
 
	@BeforeMethod()
	@Parameters({"browser"})             
	public void beforeMethod(@Optional("chrome") String browserValue) throws IOException {
        //@Optional("chrome") for running the tests in its own testclasses individually
		                                   
		readProperty();    //to load url
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//ChromeOptions co=new ChromeOptions();
		//	co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.chromedriver().setup();
		//	ChromeOptions co=new ChromeOptions();
		//	co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		}
		
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod()
	public void afterMethod(ITestResult itr) throws IOException {
		
		if(itr.getStatus()==ITestResult.FAILURE) 
		{
			sh=new ScreenShotsClass();
			sh.takeScreenShot(driver, itr.getName());
		}
		
		driver.close();
		driver.quit();
	}

}

