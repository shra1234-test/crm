package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicelmt {
	 static
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		}
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(2000);
			
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(2000);
			
}
}
