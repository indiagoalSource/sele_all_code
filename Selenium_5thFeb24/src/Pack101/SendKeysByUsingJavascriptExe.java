package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysByUsingJavascriptExe {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Send text by javaScript
		js.executeScript("document.getElementById('email').value='test@abc.com'");
		js.executeScript("document.getElementById('pass').value=1234567676767");
		
		Thread.sleep(2000);
		
		//clear the text field
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(userName.getAttribute("value"));
		Thread.sleep(2000);
		userName.clear();
		
		//Highligh the element by using JS
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userName);
		
		// will give location of field on page
		System.out.println( userName.getLocation() ) ;
		
		Thread.sleep(2000);
		//open new tab by sendKeys method BUT NOT working
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		// OR
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.open()");
		
	}

}
