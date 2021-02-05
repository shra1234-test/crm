package Qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
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
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[id='u_0_2']")).click();
			Thread.sleep(2000);
			
		driver.findElement(By.cssSelector("input[id='u_3_b']")).sendKeys("sri");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys("sri");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Moblile number or email address']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='New Password']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("7");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1984");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[class='_58mt']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id='u_3_s']")).click();
		
			//link.click();
			Thread.sleep(2000);
			driver.close();
		}
	}



