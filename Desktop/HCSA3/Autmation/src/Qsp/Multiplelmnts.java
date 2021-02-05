package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelmnts {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		int a=0;
		int b=0;
		
		for(WebElement link : allLinks  )
		{
			boolean v=link.isDisplayed();
			if(v)
			{
				a++;
			}
			else
			{
				b++;
			}
			
		}
		System.out.println(a);
		System.out.println(b);
		Thread.sleep(2000);
		driver.close();
	}

}
