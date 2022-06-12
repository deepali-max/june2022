package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchGooglePage {
	
	WebDriver driver;

	public SearchGooglePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//locators
	
	
	//functions
	
	public void search() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		
	}

}
