package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelecAndisDisaplyed {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		WebElement CrenewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		CrenewAcc.click();
		Thread.sleep(2000);
		
		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
		boolean result = custom.isSelected();
		
		if(result == false)
		{
			System.out.println(result);
			System.out.println("is NOT selected");
			custom.click();
		}
		else
		{
			System.out.println("is Selected");
		}
		
		result = custom.isSelected();
		System.out.println(result);
		
		WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
				
		result = pronoun.isDisplayed();
		System.out.println(result);
		
		
	}

}
