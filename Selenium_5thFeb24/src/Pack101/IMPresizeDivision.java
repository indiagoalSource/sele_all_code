package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IMPresizeDivision {
	
	static WebDriver driver;
	
	public static void resize(WebElement eleToresize, int xpos, int ypos)
	{
		Actions	act = new Actions(driver);
		act.clickAndHold(eleToresize).moveByOffset(xpos, ypos).release().build().perform();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		
		WebElement divi = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		
		Actions act = new Actions(driver);
	//	act.clickAndHold(divi).moveByOffset(200,200).release().build().perform();
		resize(divi,200,200);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.moveToElement(doubleclick).doubleClick().perform();
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(1000);
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().perform();
		
		Thread.sleep(1000);
		
		WebElement slid = driver.findElement(By.xpath("//div[@id='slider']//span"));
		js.executeScript("arguments[0].scrollIntoView(true);", slid);
		js.executeScript("window.scrollBy(0,-200)");
		act.moveToElement(slid).dragAndDropBy(slid, 30, 20).perform();
		
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(frame);
		
		WebElement cal = driver.findElement(By.cssSelector("span.icon_calendar"));
		cal.click();
		
		Thread.sleep(1000);
		WebElement selYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel1 = new Select(selYear);
		
		sel1.selectByVisibleText("2001");
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		
		while(!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("November"))
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(1000);
		}
		
		WebElement date9 = driver.findElement(By.xpath("//a[@data-date='9']"));
		date9.click();
		
	}

}
