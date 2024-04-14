package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSelectmethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement creatNew = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		creatNew.click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s1 = new Select(date);
		Select s2 = new Select(month);
		Select s3 = new Select(year);
		
		s1.selectByIndex(8);
		s2.selectByIndex(10);
		s3.selectByValue("1986");
		
		s1.selectByVisibleText("10");
		s2.selectByVisibleText("May");
		s3.selectByVisibleText("1991");
		
		
	}

}
