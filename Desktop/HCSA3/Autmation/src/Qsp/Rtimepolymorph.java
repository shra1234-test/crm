package Qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtimepolymorph {

	public static void main(String[] args) throws InterruptedException
	{ System.out.println("enter the browser");
	Scanner sc=new Scanner(System.in);
	String browser=sc.next(); 
	WebDriver driver=null;
	if(browser.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shraddha\\Desktop\\HCSA3\\Autmation\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
		
	else if(browser.equals("ch"))
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shraddha\\Desktop\\HCSA3\\Autmation\\Drivers\\chromedriver.exe");
driver= new ChromeDriver();
	}
Thread.sleep(20000);
driver.close();

}
}


