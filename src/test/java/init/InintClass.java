package init;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.SearchGooglePage;
import pages.SearchGoogletwoPage;



public class InintClass {

	
	//Driver Launch
	
	public static ChromeOptions options= new ChromeOptions();
	public static EdgeOptions edgeoptions= new EdgeOptions();
	public static WebDriver driver;
	public static SearchGooglePage googlepage;
	public static SearchGoogletwoPage googlepagetwo;
	
	
	
	
	
	@BeforeTest

	public void launchBrowser() throws InterruptedException {
		String s = System.getenv("qaperson");
		System.out.println(s);
		
		String env = System.getenv("env");
		System.out.println(env);
		
		
		
		
		
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\preeti\\Desktop\\Motu Selenium prerequiste\\edgedriver_win32\\msedgedriver.exe");
		
		//driver = new EdgeDriver();
		
//------------------------------------------------------------------------------------------------------------------		
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\614296257\\Downloads\\edgedriver_win32\\msedgedriver.exe");
//		EdgeOptions opt = new EdgeOptions();
//		opt.addArguments("-inprivate");
//		driver = new EdgeDriver(opt); 
		
		
		
		
//------------------------------------------------------------------------------------------------------------------		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Desktop\\Motu Selenium prerequiste\\chromedriver_win32\\chromedriver.exe");
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		//driver.get("http://localhost:4200");
	//driver.get("http://localhost:4200/item/1");
		//if(env.equalsIgnoreCase("dev")) {
//DEV URL
		//driver.get("https://www.google.com");
		//}
		//else if(env.equalsIgnoreCase("qa")) {
			
			//driver.get("https://ui.score-test.bt.com");
			
		//}
	//driver.get("https://dtj30cyp6ilqz.cloudfront.net");
	//driver.get("http://localhost:4200/location");
		//driver.get("http://dtj30cyp6ilqz.cloudfront.net");
	//Alternative URL
	//driver.get("https://d1fuem0mkw8lbh.cloudfront.net");
	
		//driver.get("https://ui.score-test.bt.com");
		
		//NFT URL
		//driver.get("https://ui.score-nft.bt.com");
		
	
//	try {
//	driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("deepali.kansal@bt.com");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Vasthava#1510");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@id='submitButton']")).click();
//	Thread.sleep(5000);
//	}catch(Exception e) {
//		
//	}
	
	
	//Thread.sleep(5000);
		
//CommonFunctions.explicitWaitForNavigationPannel();

	
	
	
	
	
	//assetdetailpage= new ViewAssetDetailPage(driver);
	//addassetpage= new AddAssetPage(driver);
		
		googlepage = new SearchGooglePage(driver);
		googlepagetwo = new SearchGoogletwoPage(driver);
	
	
	
	
	
	
	
	
	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver.get("https://www.google.com");
		
		
	}
	
	
	
	
	
	
	@AfterTest
	public void closeDriver() {
		
		//driver.close();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	//Create page object
}