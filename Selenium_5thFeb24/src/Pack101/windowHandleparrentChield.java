package Pack101;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandleparrentChield {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirmbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement promtbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement lineBreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alertbox.click();
		confirmbox.click();
		promtbox.click();
		lineBreak.click();
		
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);
		System.out.println("--------------------------");
		
		ArrayList<String> allAddrs = new ArrayList<String> ( driver.getWindowHandles() );
		
		System.out.println(allAddrs.get(0));
		System.out.println(allAddrs.get(1));
		System.out.println(allAddrs.get(2));
		System.out.println(allAddrs.get(3));
		
		driver.switchTo().window(allAddrs.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(allAddrs.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(allAddrs.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(allAddrs.get(3));
		System.out.println(driver.getCurrentUrl());
		
	
	}

}
