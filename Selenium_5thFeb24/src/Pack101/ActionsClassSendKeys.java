package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSendKeys {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	// 	send text to webelement by JS
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('APjFqb').value='test'");
		
		WebElement ele = driver.findElement(By.xpath("//textarea[@title='Search']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).sendKeys(Keys.ENTER).build().perform();
		
	//	get title of page
		System.out.println( js.executeScript("return document.title") );
	// 	OR
		System.out.println(driver.getTitle());
		
	}

}
