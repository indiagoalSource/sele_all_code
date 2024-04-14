package Pack101;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAmazonuptoCart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//from 4.0.0
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//until 3.141.59
	//	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		
		WebElement clickSer = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		WebElement serach = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickSer.click();
		clickSer.sendKeys("Mobile");
		serach.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Featured']"))).click().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Price: High to Low']"))).click().perform();
	//	Thread.sleep(3000);
		WebElement mobile1st = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]//a//span)[1]"));
		mobile1st.click();
		
		ArrayList<String> lists = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(lists.get(1));
		
		WebElement addto = driver.findElement(By.xpath("(//input[@name='submit.addToCart'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addto);
		js.executeScript("window.scrollBy(0,-100)");
	//	Thread.sleep(2000);
		addto.click();
		
	//	Thread.sleep(2000);
		WebElement carttop = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		act.moveToElement(carttop).click().perform();
		
		WebElement emi = driver.findElement(By.xpath("//span[contains(text(),'EMI Available')]"));
		emi.click();
		WebElement learnmore = driver.findElement(By.xpath("//a[text()='Learn more']"));
		learnmore.click();
	//	Thread.sleep(2000);
		
		ArrayList<String> lists1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lists1.get(2));
		driver.close();
		
		driver.switchTo().window(lists1.get(1));
		WebElement getprice = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[4]"));
		System.out.println("Your Price will be Rs."+getprice.getText());
		
		
		
	}

}
