package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoB{
	@Test
	public class DemoA2 {
		@Test(priority=1,groups="smoke")
	public void registerUser()
	{
			Reporter.log("user is registered", true);
		
	}
		@Test(priority=2,groups={"smoke","reg"})
		public void deleteUser()
		{
				Reporter.log("user is deleted", true);
			
			
		}
		@Test(priority=3,groups="reg")
		public void editUser()
		{
				Reporter.log("user is edited", true);
			
		}
	}

}
