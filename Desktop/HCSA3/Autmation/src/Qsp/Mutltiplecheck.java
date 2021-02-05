package Qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mutltiplecheck {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shraddha/Desktop/html/ex3.html");
		List<WebElement> allLinks=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			Thread.sleep(1000);
			WebElement ch=allLinks.get(i);
			ch.click();
			
		}
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
