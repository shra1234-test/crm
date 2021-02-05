package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shraddha/Desktop/html/alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo(). alert();
		String txt=a.getText();
		System.out.println(txt);
		a.accept();
		Thread.sleep(2000);
		driver.close();
		

	}

	
}
