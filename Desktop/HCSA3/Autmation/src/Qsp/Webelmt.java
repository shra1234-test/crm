package Qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelmt {
    static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shraddha/Desktop/sample.html");
		//WebElement link=driver.findElement(By.id("f"));
		//WebElement link=driver.findElement(By.name("forgot"));
		//WebElement link=driver.findElement(By.className("pass"));
		//WebElement link=driver.findElement(By.tagName("a"));
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sri");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sri");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[id='f']")).click();
	
		//link.click();
		Thread.sleep(2000);
		driver.close();
	}
}
