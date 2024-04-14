package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath2ndMobile {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		
//		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		search.click();
//		search.sendKeys("Mobile");
//		
//		WebElement clickOn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		clickOn.click();
//		
//		WebElement mob2 = driver.findElement(By.xpath("((//div[@data-cy='title-recipe'])[2]//span)[10]"));
//		mob2.click();
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		WebElement clickSer = driver.findElement(By.xpath("//button[@type='submit']"));
		search.sendKeys("Mobile");
		clickSer.click();
		
		WebElement mob2nd = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[2]//div)[2]"));
		mob2nd.click();
		
		
		
		
	}

}
