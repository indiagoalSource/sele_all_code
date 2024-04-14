package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LicActionsSelect {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://licindia.in/buy-online");
		driver.manage().window().maximize();
		
		WebElement customer = driver.findElement(By.xpath("(//a[@title='Customer Services'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(customer).perform();
		
		WebElement premium = driver.findElement(By.xpath("//a[contains(text(),'Premium Payment')]"));
		act.moveToElement(premium).perform();
		
		WebElement licportal = driver.findElement(By.xpath("//a[contains(text(),'LIC PORTAL')]"));
		act.moveToElement(licportal).click().perform();
		
		WebElement home = driver.findElement(By.xpath("//a[@class='active homec']"));
		home.click();
		Thread.sleep(4000);
		
		WebElement close = driver.findElement(By.xpath("//button[text()='Close']"));
		Thread.sleep(6000);
		close.click();
		
		
		WebElement select1 = driver.findElement(By.xpath("(//select[@onchange='InternalLink(this.value);'])[1]"));
		select1.click();
		
		Select sel = new Select(select1);
		sel.selectByVisibleText("Create wealth");
		
		
		
	
		
//		driver.navigate().to("https://edition.cnn.com/newsletters");
//		WebElement select = driver.findElement(By.xpath("//button[@title='Select Five Things']"));
//		boolean result = select.isSelected();
//		System.out.println(result);
//		
//		if(result == false)
//		{
//			//select.click();
//		}
//		Thread.sleep(3000);
//		
//		//WebElement check_sel = driver.findElement(By.xpath("//button[@title='Five Things selected']"));
//		//boolean re1 = check_sel.isEnabled();
//		//System.out.println(re1);
//		
//		//select.click();
//		WebElement signUp = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
//		boolean re1 = signUp.isDisplayed();
//		System.out.println(re1);
//		
//		WebElement text = driver.findElement(By.xpath("(//p[@class='newsletter-hub-card__desc'])[2]"));
//		System.out.println(text.getText());
//		System.out.println(text.getAttribute("class"));
//		
//		WebElement news = driver.findElement(By.xpath("(//p[@class='newsletter-hub-card__desc'])[4]"));
//		System.out.println(news.getText());
//		System.out.println(news.getTagName());
//		
//		System.out.println(signUp.getTagName());
//		Thread.sleep(3000);
//		
//		WebElement sel = driver.findElement(By.xpath("//button[@title='Select Breaking News']"));
//		sel.click();
//		
//		System.out.println(sel.isEnabled());
//		System.out.println(sel.getAccessibleName());
//		System.out.println(sel.getAriaRole());
		
		
	}

}
