package Pack101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSortedOrNot {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
	//	driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select sel = new Select(dropdown);
		
		ArrayList orgList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement e : sel.getOptions())
		{
			orgList.add(e.getText());
			tempList.add(e.getText());
		}
		
		Collections.sort(tempList);
		
		System.out.println("org list = " +orgList);
		System.out.println("sorted list = " +tempList);
		
		if(tempList == orgList)
		{
			System.out.println("dropdown list is Sorted");
		}
		else
		{
			System.out.println("dropdown list is NOT sorted");
		}
		
	}

}
