package Pack101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagesBrokenAndLinks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/amol/OneDrive/Desktop/webpage1.html");
		
		List<WebElement> allimg = driver.findElements(By.xpath("//img"));
		
		for(int i=0; i<allimg.size(); i++)
		{
			if(allimg.get(i).getAttribute("src").equals(""))
			{
				System.out.println("broken images = " +allimg.get(i).getAttribute("src"));
			}
			else
			{
				//System.out.println("Working images = " +allimg.get(i).getAttribute("src"));
			}
		}
		
		System.out.println("------------------------------");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		for(int k=0; k<alllinks.size(); k++)
		{
			if(alllinks.get(k).getAttribute("href").equals(""))
			{
				System.out.println("broken links = " +alllinks.get(k).getText());
			}
			else
			{
				//System.out.println("working links = " +alllinks.get(k).getAttribute("href"));
			}
		}
		
	}

}
