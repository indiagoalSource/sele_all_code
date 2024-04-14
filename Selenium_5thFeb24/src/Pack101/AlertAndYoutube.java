package Pack101;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndYoutube {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement submitt = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement reset = driver.findElement(By.xpath("//input[@type='reset']"));
		
		
		submitt.click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(3000);
		alt.accept();
		
		
		
		
//		driver.get("https://www.youtube.com/");
//		
//		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
//		WebElement clickSe = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
//		search.sendKeys("tere bato me aisa");
//		clickSe.click();
//		
//		Thread.sleep(3000);
//		WebElement play = driver.findElement(By.xpath("(//a[contains(@title,'Teri Baaton Mein Aisa')])[2]"));
//		play.click();
//		
//		WebElement fullSc = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
//		fullSc.click();
		
				
	}

}
