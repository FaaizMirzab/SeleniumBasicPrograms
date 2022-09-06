package testNG_P1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test
	public void test() {
		Reporter.log("haai",true);
		Reporter.log("hello",true);
		Assert.assertEquals("mirzab ","faaiz");
		Reporter.log("mirzab",true);
		}
}
