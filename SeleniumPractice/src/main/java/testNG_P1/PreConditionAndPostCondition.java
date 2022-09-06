package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreConditionAndPostCondition {
	@Test(priority=1)
	public void UserUpdate() {
		Reporter.log("user updated",true);
	}
	@Test(priority=2)
	public void UserDelete() {
		Reporter.log(" user deleted",true);
	}
	@BeforeMethod
	public void UserLogin() {
		Reporter.log(" User login",true);
	}
	@AfterMethod
	public void UserLogout() {
		Reporter.log("user Logout",true);
	}

}
