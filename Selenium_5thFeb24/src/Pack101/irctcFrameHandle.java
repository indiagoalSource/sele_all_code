package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctcFrameHandle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		WebElement disha = driver.findElement(By.xpath("//div[@id='disha-banner-button']"));
		disha.click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='Disha-Bot']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement fromdate = driver.findElement(By.xpath("//div[contains(text(),'Select Your Source Station')]"));
		fromdate.click();
		
		WebElement fromSt = driver.findElement(By.xpath("//input[@id='station-textbox']"));
		fromSt.click();
		fromSt.sendKeys("pune");
		
		Thread.sleep(2000);
		WebElement selectSt = driver.findElement(By.xpath("//div[@class='stations']//img"));
		selectSt.click();
		
		WebElement toSt = driver.findElement(By.xpath("//div[text()='Select Your Destination Station']"));
		toSt.click();
		
		Thread.sleep(2000);
		WebElement selectSt1 = driver.findElement(By.xpath("//input[@id='station-textbox']"));
		selectSt1.click();
		selectSt1.sendKeys("bangaluru");
		
		Thread.sleep(2000);
		WebElement banga = driver.findElement(By.xpath("(//div[@class='stations']//div//div//img)[3]"));
		banga.click();
		
		WebElement book = driver.findElement(By.xpath("//button[text()='Book Ticket']"));
		book.click();
		
		
		
	}

}
