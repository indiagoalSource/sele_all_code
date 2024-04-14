package Pack101;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupHandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement seleN = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		seleN.click();
		
		ArrayList<String> ele = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(ele.get(1));
		
		WebElement clickOn = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOn.click();
		
		
	}

}
