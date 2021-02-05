package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	 static
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		}
	 public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sri");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sri");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			Thread.sleep(2000);
				driver.close();

}
}
