package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazontest {
	public static void main(String[] args) throws InterruptedException {
		
		// to handle chrome browser popups
		// pass this object "options" as a argument like below
		//WebDriver driver = new ChromeDriver(options);
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("chrome.switches","--disable-extensions");
//		options.addArguments("--disable-save-password");
//		options.addArguments("disable-infobars");
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		mobile.click();
		
		Thread.sleep(2000);
		WebElement serach = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		serach.click();
		serach.sendKeys("samsung s24 ultra");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		Thread.sleep(2000);
		WebElement samsung24 = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy S24 Ultra')])[4]"));
		samsung24.click();
		
		
	}

}
