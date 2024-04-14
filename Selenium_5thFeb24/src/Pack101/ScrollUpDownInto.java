package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownInto {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/default.asp");
		Thread.sleep(3000);
		
		WebElement beforeQuiz = driver.findElement(By.xpath("//a[contains(text(),'Complete JavaScript Reference')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0,2000)");	// scroll down
//		js.executeScript("window.scrollBy(0,-2000)");	// scroll up
//		js.executeScript("window.scrollBy(2000,0)");	// scroll right
//		js.executeScript("window.scrollBy(-2000,0)");	// scroll left
		
		//scroll till the webelement come at top.
		js.executeScript("arguments[0].scrollIntoView(true);", beforeQuiz);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-200)");
		beforeQuiz.click();
		
		
	}

}
