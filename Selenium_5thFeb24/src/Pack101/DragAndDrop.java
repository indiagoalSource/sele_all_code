package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
		WebElement items = driver.findElement(By.xpath("//a[@id='nav-orders']"));
		WebElement serachBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		act.moveToElement(items).clickAndHold().moveToElement(serachBox).release().build().perform();
		
		
	}

}
