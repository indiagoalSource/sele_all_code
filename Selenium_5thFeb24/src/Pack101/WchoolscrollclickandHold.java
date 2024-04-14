package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WchoolscrollclickandHold {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/default.asp");
		
		WebElement submitt = driver.findElement(By.xpath("//button[text()='Submit Answer »']"));
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", submitt);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
		
		WebElement service = driver.findElement(By.xpath("//a[contains(text(),'Services')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(service).click().perform();
		
		WebElement reff = driver.findElement(By.xpath("//h4[text()='References']"));
		act.moveToElement(reff).click().perform();
		Thread.sleep(3000);
		WebElement scrr = driver.findElement(By.xpath("//div[@id='btn_container_subtopnav']"));
		act.moveToElement(scrr).clickAndHold().build().perform();
		
		
	}

}
