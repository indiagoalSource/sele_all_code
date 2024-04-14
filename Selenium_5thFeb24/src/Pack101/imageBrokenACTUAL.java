package Pack101;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageBrokenACTUAL {
	
	public static void verifyLinks(String url) throws IOException
	{
		try {
		URL link = new URL(url);
		HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
		httpcon.setConnectTimeout(2000);
		httpcon.connect();
		
		if(httpcon.getResponseCode() == 200)
		{
			System.out.println( url + " --> " +httpcon.getResponseMessage() );
		}
		else
		{
			System.out.println( url + " --> " +httpcon.getResponseMessage() + "-" + "broken url");
		}
		}
		
		catch(Exception e)
		{
			System.out.println(url + " -> link is broken");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='AppNavbar_navbar___zLKe']//a"));
		
		for(WebElement lnk : links)
		{
			String url = lnk.getAttribute("href");
			verifyLinks(url);
		}
		
	}

}
