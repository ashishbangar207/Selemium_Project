package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;//instance variable 
	By LOGO = By.xpath("//span[@class='hmsprite logo']");
	By SignIn=By.xpath("//a[@title='Already a user? Sign in']");
	
	public RediffHomePage (WebDriver driver) {//locul variable 
		this.driver=driver;
		
	}
	public WebElement logo() {
		
		return driver.findElement(LOGO);
		
	}
	public WebElement SignIn () {
		return driver.findElement(SignIn);
	}

}
