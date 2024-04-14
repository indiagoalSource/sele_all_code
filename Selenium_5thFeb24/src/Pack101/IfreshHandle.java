package Pack101;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfreshHandle {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement alerttry = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alerttry.click();
		
		ArrayList<String> lists = new ArrayList<String>( driver.getWindowHandles() );
		driver.switchTo().window(lists.get(1));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
	//	driver.switchTo().parentFrame(); // switch iframe to iframe if you go in thr
		driver.switchTo().defaultContent(); // switch directly to main page
		
		
		
		
	}

}
