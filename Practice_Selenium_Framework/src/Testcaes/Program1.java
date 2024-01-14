package Testcaes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectRepository.RediffHomePage;
import PageObjectRepository.RediffSignInPage;


public class Program1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("WebDriver.chrome.driver","C:\\Selenium Webdriver\\New_driver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://www.rediff.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);    
	}
	
	@Test
	public void VerifyLogo() {
		
		RediffHomePage rph = new RediffHomePage (driver);
		WebElement logo =rph.logo();
		Boolean flag =logo.isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void SignInTestCase() {
		RediffHomePage rph = new RediffHomePage (driver);
		rph.SignIn().click();
		RediffSignInPage rsp = new RediffSignInPage (driver);
		rsp.userName().sendKeys("ashishbangar");
		rsp.password().sendKeys("Ashish@12345");
		rsp.signinbutton().click();

	}
		@AfterMethod
		public void TearDown () {
			driver.quit();
			System.out.println("Ashish");
			System.out.println("bangar");
		}
	
	

}
