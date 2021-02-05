package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionmthd {
	 static
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String xp="//a[.='RedBrick Health']/../..//a[@title='Solutions']";
		WebElement sol=driver.findElement(By.xpath(xp));
		Actions act =new Actions(driver);
		act.moveToElement(sol).perform();
		 List<WebElement> alsub = driver.findElements(By.xpath("(//ul[@class=' dropdown-menu'])[1]/li"));
		int count=alsub.size();
		System.out.println(count);
		String s="(//ul[@class=' dropdown-menu'])[1]/li[2]";
		driver.findElement(By.xpath(s)).click();
		for(WebElement sub:alsub)
		{
			String text=sub.getText();
		
				
			System.out.println(text);
		}

	}

	
}
