package Pack101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementCountPresent {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		
		WebElement downArrow = driver.findElement(By.xpath("//span[@data-cy='switcherDownArrow']"));
		downArrow.click();
		
		WebElement selectCountry = driver.findElement(By.xpath("//p[@data-cy='selectCountry']"));
		selectCountry.click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//p[@data-cy='GeographySections_24']"));
		
		for(int i=0; i<ele.size(); i++)
		{
			System.out.println(ele.get(i).getText());
		}
		
		System.out.println("number of country = " +ele.size());
	}
	
}
