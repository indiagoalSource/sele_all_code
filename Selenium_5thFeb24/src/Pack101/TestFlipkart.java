package Pack101;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		WebElement productSe = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		productSe.sendKeys("Mobile");
		search.click();
		
		WebElement hightolow = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		Thread.sleep(2000);
		hightolow.click();
		Thread.sleep(2000);
		WebElement mobile2nd = driver.findElement(By.xpath("((//a[@target='_blank'])[2]//div)[12]"));
		mobile2nd.click();
		
		ArrayList<String> listss = new ArrayList<String>( driver.getWindowHandles() );
		driver.switchTo().window(listss.get(1));
		driver.manage().window().maximize();
		
		WebElement addtocart = driver.findElement(By.xpath("(//div[@class='Qc7Nxn']//span)[15]"));
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("arguments[0].scrollIntoView(true);",addtocart );
		jss.executeScript("window.scrollBy(0,-100)");
		addtocart.click();
		Thread.sleep(2000);
		
		WebElement addagain = driver.findElement(By.xpath("//span[text()='Add Item']"));
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(addagain).click().perform();
		act.moveToElement(login).click().perform();
		
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		
		WebElement cartvalue = driver.findElement(By.xpath("(//div[@class='_3LxTgx']//span)[2]"));
		System.out.println("Your Cart Value => " +cartvalue.getText());
		
		
		
	}
	
}
