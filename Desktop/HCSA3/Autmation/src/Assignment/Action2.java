package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://home.redbrickhealth.com/");
	String xp="//a[.='RedBrick Health']/../..//a[@title='Solutions']";
	WebElement sol=driver.findElement(By.xpath(xp));
	Actions act =new Actions(driver);
	act.moveToElement(sol).perform();
	Thread.sleep(2000);
	 List<WebElement> alsub = driver.findElements(By.xpath("(//ul[@class=' dropdown-menu'])[3]/li"));
	int count=alsub.size();
	System.out.println(count);
	ArrayList<String > a1=new ArrayList<>();
	for(WebElement sub:alsub)
	{
		a1.add(sub.getText());
	}
	Collections.sort(a1);
	for(String str:a1 )
	{
		System.out.println(str);
	}
	
	Thread.sleep(2000);
    driver.close();

}


}


