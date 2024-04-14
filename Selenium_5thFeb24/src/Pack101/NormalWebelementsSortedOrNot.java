package Pack101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalWebelementsSortedOrNot {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement moreLan = driver.findElement(By.xpath("//a[@title='Show more languages']"));
		moreLan.click();
		Thread.sleep(2000);
		
		List<WebElement> allCoun = driver.findElements(By.xpath("//div[@id='intl-region-container']//a"));
		
	//	List<WebElement> allCoun1 = driver.findElements(By.xpath("//div[@id='intl-region-container']//a"));
		
		ArrayList orgList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement e : allCoun)
		{
			orgList.add(e.getText());
			tempList.add(e.getText());
		}
		
		Collections.sort(tempList);
		
		if(orgList.equals(tempList))
		{
			System.out.println("List is sorted");
		}
		else
		{
			System.out.println("NOT sorted");
		}
		
		System.out.println(orgList);
		System.out.println(tempList);
		
	}

}
