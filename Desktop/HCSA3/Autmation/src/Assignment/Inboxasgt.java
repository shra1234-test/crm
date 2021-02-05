package Assignment;

import java.io.File;
	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.By.ByXPath;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

	import com.google.common.io.Files;

	public class Inboxasgt{
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
			driver.get("https://www.flipkart.com/");
			getScreenShot(driver, "demoA");
			// driver.findElement(By.xpath("//button[.='✕']")).click();
			// Thread.sleep(2000);
		 //WebElement in = driver.findElement(By.xpath("//a[.='Login']"));
		 //Actions act=new  Actions(driver);
		 ////act.moveToElement(in).perform();
		 //getScreenShot(driver, "demoB");
		 // List<WebElement> almenu = driver.findElements(By.xpath("//span[@class='_2FZd5H']"));
		  //Actions act=new  Actions(driver);
		 // for(WebElement menu:almenu )
		 // { 
			//  Thread.sleep(2000);
			//  String name=menu.getText();
			 // act.moveToElement(menu).perform();
			 // getScreenShot(driver,name);
		 // }
		 //Thread.sleep(2000);
			//driver.close();
			
		
			

		}

	}









