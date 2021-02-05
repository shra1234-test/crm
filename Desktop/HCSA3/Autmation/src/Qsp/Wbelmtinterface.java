package Qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wbelmtinterface {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("file:///C:/Users/Shraddha/Desktop/html/ex4.html");
			//WebElement fname=driver.findElement(By.xpath("/html/body/input[1]"));
			//fname.sendKeys("admin");
			//Thread.sleep(2000);
			//fname.sendKeys(Keys.CONTROL+"ac");
			//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys(Keys.CONTROL+"v");
			//fname.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/input[3]")).click();
			//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys(Keys.ENTER);
			//WebElement link=driver.findElement(By.id("f"));
			//String tname=link.getTagName();
			//System.out.println(tname);
			//String aname=link.getAttribute("href");
			//System.out.println(aname);
			//String text=link.getText();
			//System.out.println(text);
			//String color=link.getCssValue("color");
			//System.out.println(color);
			//String size=link.getCssValue("font-size");
			//System.out.println(size);
			//String style=link.getCssValue("font-style");
			//System.out.println(style);
			driver.get("https://demo.actitime.com/login.do");
			WebElement un=driver.findElement(By.id("username"));
			Dimension und=un.getSize();
			int unh=und.getHeight();
			int unw=und.getWidth();
			System.out.println(unh);
			System.out.println(unw);
			WebElement pw=driver.findElement(By.name("pwd"));
			Dimension pwd=un.getSize();
			int pwh=und.getHeight();
			int pwt=und.getWidth();
			System.out.println(pwh);
			System.out.println(pwt);
			if(unh==pwh && unw==pwt)
			{
				System.out.println("same size");
			}
			else
			{
				System.out.println("not same size");
			}
			Point p=un.getLocation();
			int x=p.getX();
			int y=p.getY();
			System.out.println(x);
			System.out.println(y);
			boolean v=un.isEnabled();
			if(v)
			{
			System.out.println("is eniplayed");
			}
			else
			{
				System.out.println("isnot diplayed");
			}
			
			Thread.sleep(2000);
			
			driver.close();
	}
}
