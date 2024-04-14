package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cnnCom{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://edition.cnn.com/newsletters");
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.xpath("(//button[contains(text(),'Log In')])[1]"));
		logIn.click();
		Thread.sleep(3000);
		
		WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		signUp.click();
		
		WebElement emailAdd = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
		Thread.sleep(3000);
		emailAdd.click();
		emailAdd.sendKeys("indgoal10@yahoo.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='registration-password-input']"));
		password.sendKeys("amol0099");
		
		WebElement creAcc = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
		creAcc.click();
		
		
		
	}

}
