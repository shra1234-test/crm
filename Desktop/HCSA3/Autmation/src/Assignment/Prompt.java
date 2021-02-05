package Assignment;
 import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Prompt {
	static
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			}

			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Shraddha/Desktop/html/Prompt.html");
				driver.findElement(By.xpath("//button[.='Try it']")).click();
				Thread.sleep(2000);
				try
				{
					
				Alert a = driver.switchTo(). alert();
				System.out.println("pop is displayed");
				a.sendKeys("dinga");
				a.accept();
				String text=driver.findElement(By.id("demo")).getText();
				if(text.equals("HELLOdingaHOW ARE YOU TODAY"))
				{System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
				}
				catch(Exception e)
				{
					System.out.println("pop is not displayed");
				}
				
				//String txt=a.getText();
				//System.out.println(txt);
				
				String text=driver.findElement(By.id("demo")).getText();
				
				Thread.sleep(2000);
				driver.close();
				

			}

			
		}






