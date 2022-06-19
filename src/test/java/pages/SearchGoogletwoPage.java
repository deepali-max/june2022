package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchGoogletwoPage {
	
	WebDriver driver;

	public SearchGoogletwoPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//locators
	
	
	//functions
	
	public void searchnew() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Thread.sleep(2000);
	}
	
public void clickimage() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(2000);
	}

}
