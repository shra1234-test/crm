package Qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

import com.google.common.io.Files;

public class Screensht {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void getScreenShot(WebDriver driver,String name)
	{ 
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./demo.png");
		 try
		 {
			 Files.copy(src, dest);
		 }
		 catch(IOException e)
		 {
			 
		 }
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		getScreenShot(driver, "demoA");
		driver.findElement(By.linkText("Gmail")).click();
		getScreenShot(driver, "demoB");
		
		Thread.sleep(2000);
		driver.close();
	
		

	}

}
