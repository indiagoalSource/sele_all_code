package Pack101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlTableMultiElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
			
		
		List<WebElement> allele = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
			
		for(int i=0; i<allele.size(); i++)
		{				
			List<WebElement> tdata = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));
				
			for(int j=0; j<tdata.size(); j++)
			{
				System.out.print(tdata.get(j).getText()+ ",");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
