package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmthd {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(20000);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		System.out.println(src);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		
		
		
	}

}
