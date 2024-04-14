package Pack101;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceAutoSite {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32 (1)_123\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textArea = driver.findElement(By.xpath("//*[@id='textarea']"));
		
	//	Actions act = new Actions(driver);
	//	act.moveToElement(textArea).dragAndDropBy(textArea, 10, 0).build().perform();
		
		textArea.sendKeys("this is text area where we can send number of lines"+Keys.ENTER + "NEW line starts here"+Keys.ENTER+ "3rd line start here");
		
		WebElement male = driver.findElement(By.cssSelector("input#male"));
		male.click();
		
		WebElement color = driver.findElement(By.xpath("//select[@id='colors']"));
		
		Select sel = new Select(color);
		sel.selectByVisibleText("White");
		
		WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
		date.sendKeys("11/09/1988"+Keys.TAB);
		
		WebElement amount = driver.findElement(By.xpath("(//td[text()='Amod'])[1]/following-sibling::td[2]"));
		System.out.println(amount.getText());
		
		List<WebElement> allEle = driver.findElements(By.xpath("//*[@id='productTable']//td"));
		
		for(WebElement e : allEle)
		{
			if(e.getText().equals("$19.99"))
			{
				driver.findElement(By.xpath("//*[@id='productTable']//td[text()='$19.99']/following-sibling::td//input")).click();
			}
		}
		
		WebElement textWiki = driver.findElement(By.cssSelector("input.wikipedia-search-input"));
		textWiki.sendKeys("mobile"+Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement> serachAll = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']//a"));
		
		for(WebElement e : serachAll)
		{
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		
		List<WebElement> buttons = driver.findElements(By.xpath("//div[@id='HTML9']/child::div[1]/child::button"));
		
		for(WebElement e : buttons)
		{
			e.click();
			Thread.sleep(1000);
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
		}
		
		
	}

}
