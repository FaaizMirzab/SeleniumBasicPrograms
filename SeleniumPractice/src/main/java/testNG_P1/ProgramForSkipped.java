package testNG_P1; 
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ProgramForSkipped {
	@Test
	public void registered() {
		Reporter.log("hello",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "registered")
	public void login() {
		Reporter.log(" hai ",true);
	}
}
