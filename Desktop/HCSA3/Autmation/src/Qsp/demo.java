package Qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	public static void main(String[] args) throws InterruptedException
	{ System.out.println("enter the browser");
	Scanner sc=new Scanner(System.in);
	String browser=sc.next();
	if(browser.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shraddha\\Desktop\\HCSA3\\Autmation\\Drivers\\geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		Thread.sleep(20000);
		f.close();
	}
	else if(browser.equals("ch"))
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shraddha\\Desktop\\HCSA3\\Autmation\\Drivers\\chromedriver.exe");
ChromeDriver c= new ChromeDriver();
Thread.sleep(20000);
c.close();
}
}
}
