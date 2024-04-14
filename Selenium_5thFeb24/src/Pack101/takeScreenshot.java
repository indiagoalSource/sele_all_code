package Pack101;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class takeScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//OR
		//File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
//		Random rand = new Random();
//		int num = rand.nextInt(1,100);
//		
//		for(int i=1; i<=5; i++)
//		{
//			File dest = new File("C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\screenshots\\test"+num+"_"+i+".png");
//			FileHandler.copy(src, dest);
//		}
		
		
String date = new SimpleDateFormat("dd-MM-yyyy hh mm ss").format(Calendar.getInstance().getTime());

System.out.println(date);
		
File dest = new File("C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\screenshots\\Test-"+date+".png");
FileHandler.copy(src, dest);


	
	}

}
