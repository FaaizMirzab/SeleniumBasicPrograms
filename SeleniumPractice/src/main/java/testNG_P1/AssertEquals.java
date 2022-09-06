package testNG_P1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
	@Test
	public void main() {
		Reporter.log("hai",true);
		Reporter.log("hello ",true);
		Assert.assertEquals("abcd","acd");
	}

}
