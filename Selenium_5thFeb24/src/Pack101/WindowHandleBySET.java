package Pack101;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleBySET {
	
	static String hand1;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String currentHand = driver.getWindowHandle();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String actual : handles)
		{
			if(!actual.equalsIgnoreCase(currentHand))
			{
				driver.switchTo().window(actual);
				driver.get("https://www.amazon.in/");
				hand1 = driver.getWindowHandle();
				break;
			}
		}
		
		for(String Agg : handles)
		{
			if(!Agg.equalsIgnoreCase(currentHand) && !Agg.equalsIgnoreCase(hand1))
			{
				driver.switchTo().window(Agg);
				driver.get("https://www.google.com/");
				break;
			}
		}
		
	}
	
}
