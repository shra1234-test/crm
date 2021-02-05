package Qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	@BeforeMethod 
	public void beforMethod()
	{
		Reporter.log("before method", true);
	}
@AfterMethod
public void afterMethod()
{
	Reporter.log("after method", true);
	
}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before class", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("after class", true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("BeforeTest", true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("AfterTest", true);
	}
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("beforeSuite", true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("afterSuite", true);
	}
	
}

	

