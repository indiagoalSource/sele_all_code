package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptCheckBoxHandleAndMore {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("document.getElementById('male').click()");
		Thread.sleep(2000);
		
	//	create alert box on page
	//	js.executeScript("alert('I am an alert box!')");
		
	// 	reload window - not working
	//	driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		
		// reload window working fine
		js.executeScript("location.reload()");
		
		// get innerText of entire Webpage
	//	System.out.println( js.executeScript("return document.documentElement.innerText") );
		
		// get URL by using js
		System.out.println( js.executeScript("return document.URL") );
		
		// get domain 
		System.out.println( js.executeScript("return document.domain") );
		
		// add goggle.com at the end and navigate
		js.executeScript("window.location.href = 'google.com'");
		
		// open google.com in place of current url
		js.executeScript("window.location.href = 'http://google.com/'");
		
	}

}
