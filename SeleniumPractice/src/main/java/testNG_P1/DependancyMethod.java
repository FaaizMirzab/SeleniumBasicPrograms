package testNG_P1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependancyMethod {
	@Test
	public void register() {
		Reporter.log("registered ",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "register" )
	public void  login() {
		Reporter.log("loggined" , true);
	}

}
