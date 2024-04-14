package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseActions {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		mobile.click();
		
		//WebElement drop = driver.findElement(By.xpath("//select[@title='Search in']"));
		
		//Select s1 = new Select(drop);
		//s1.selectByVisibleText("Movies & TV Shows");
		
		//WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mirzapur season 1 all episodes");
		
				
		WebElement laptop = driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]"));
		Actions act = new Actions(driver);
		act.moveToElement(laptop).perform();
		Thread.sleep(3000);
		
		WebElement samsung = driver.findElement(By.xpath("(//a[contains(text(),'Samsung')])[4]"));
		act.moveToElement(samsung).click().perform();
		
		WebElement camera = driver.findElement(By.xpath("//span[contains(text(),'Cameras')]"));
		act.moveToElement(camera).perform();
		
		WebElement dslr = driver.findElement(By.xpath("//h3[contains(text(),'Digital SLRs')]"));
		act.moveToElement(dslr).click().perform();
		
		
	}

}
