package Pack101;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickBuzzScore {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement indmatch = driver.findElement(By.xpath("//div[text()='4th Test • England tour of India, 2024']"));
		indmatch.click();
		
		WebElement scoreBat = driver.findElement(By.xpath("//div[@class='cb-min-inf cb-col-100 ng-scope'][1]"));
	
		System.out.print(scoreBat.getAttribute("ng-bind") +" = " +scoreBat.getText());
		
		System.out.println();
		System.out.println("---------------------------");
		
		WebElement scoreBall = driver.findElement(By.xpath("//div[@class='cb-min-inf cb-col-100 ng-scope'][2]"));
		
		System.out.print(scoreBall.getAttribute("ng-bind") + " = " +scoreBall.getText());
		
		
		
	}
}
