package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptBackgroundAndClick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("input#pass"));
		
	// 	not working
	//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow;');", ele);
		
	//	js.executeScript("window.open()");
		
	//	click on element by JS
		js.executeScript("document.getElementsByClassName('_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')[0].click()");
		
		
	}

}
