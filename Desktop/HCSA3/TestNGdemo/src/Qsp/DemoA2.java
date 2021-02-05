package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA2 {
	@Test(priority=4,groups="smoke")
public void registerTask()
{
		Reporter.log("Task is registered", true);
	
}
	@Test(priority=5,groups={"smoke","reg"})
	public void deleteTask()
	{
			Reporter.log("Task is deleted", true);
		
		
	}
	@Test(priority=6,groups="reg")
	public void editTask()
	{
			Reporter.log("Task is edited", true);
		
	}
}
