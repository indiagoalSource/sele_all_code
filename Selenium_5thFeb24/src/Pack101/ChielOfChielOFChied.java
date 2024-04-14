package Pack101;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChielOfChielOFChied {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		alertbox.click();
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);
		System.out.println(driver.getCurrentUrl());
		System.out.println("---------------------------");
		
		ArrayList<String> addrs = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(addrs.get(1));
		
		WebElement website = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		website.click();
		
		ArrayList<String> addCh = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(addCh.get(2));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("--------------------------");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement react = driver.findElement(By.xpath("//a[text()='REACT']"));
		react.click();
		
		Thread.sleep(2000);
		driver.switchTo().window(addrs.get(1));
		
		Thread.sleep(2000);
		WebElement website1 = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		website1.click();
		
		ArrayList<String> finalAdd = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(finalAdd.get(3));
		
		WebElement pyy = driver.findElement(By.xpath("//a[text()='PYTHON']"));
		pyy.click();
		
		
		
//		driver.switchTo().window(finalAdd.get(0));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(finalAdd.get(1));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(finalAdd.get(2));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(finalAdd.get(3));
//		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
//		System.out.println(addCh.get(0));
//		System.out.println(addCh.get(1));
//		System.out.println(addCh.get(2));
//		System.out.println("-------------------");
//		driver.switchTo().window(addCh.get(0));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(addCh.get(1));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(addCh.get(2));
//		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
