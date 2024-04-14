package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.yahoo.com/");
		Thread.sleep(2000);
		
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='login-username']"));
		userName.sendKeys("indgoal10");
		
		WebElement signIn1 = driver.findElement(By.xpath("//input[@id='login-signin']"));
		signIn1.click();
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=' ']"));
		Thread.sleep(1000);
		password.sendKeys("Fecfecfec123");
		
		WebElement Next1 = driver.findElement(By.xpath("//button[@id='login-signin']"));
		Next1.click();
		
		
		
	}

}
