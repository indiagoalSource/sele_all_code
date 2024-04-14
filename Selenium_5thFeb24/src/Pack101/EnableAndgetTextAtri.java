package Pack101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndgetTextAtri {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = logIn.isEnabled();
		System.out.println(result);
		
		WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		userName.sendKeys("your_user_name");
		
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("passwortext");
		
		result = logIn.isEnabled();
		System.out.println(result);
		
		System.out.println(logIn.getText());
		
		String atribut_name = password.getAttribute("aria-label");
		System.out.println(atribut_name);
		
		atribut_name = userName.getAttribute("aria-label");
		System.out.println(atribut_name);
		
		
		
	}

}
