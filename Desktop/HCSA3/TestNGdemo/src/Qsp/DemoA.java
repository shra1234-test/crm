package Qsp;

import org.testng.Assert;
import org.testng.DependencyMap;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
public void registerUser()
{
		Reporter.log("user is registered", true);
	
}
	@Test(dependsOnMethods = "registerUser")
	public void deleteUser()
	{
			Reporter.log("user is deleted", true);
		
		
	}
	@Test
	public void editUser()
	{
			Reporter.log("user is edited", true);
		
	}
}
