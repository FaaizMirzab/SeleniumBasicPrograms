package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	public void main() {
		Reporter.log("hai ",true);
		SoftAssert asert=new SoftAssert();
		asert.assertEquals("abcd","acd");
		Reporter.log("hello ",true);
		asert.assertAll();
	}
}
