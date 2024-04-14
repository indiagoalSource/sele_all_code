package Pack101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenImgorLinks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> allimg = driver.findElements(By.xpath("//img"));
		
		System.out.println(allimg.size());
		
		for(int i=0; i<allimg.size(); i++)
		{
			System.out.println(allimg.get(i).getAttribute("src"));
		}
		
		
	}

}
