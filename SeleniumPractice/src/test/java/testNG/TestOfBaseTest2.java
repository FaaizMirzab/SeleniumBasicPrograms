package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestOfBaseTest2 extends BaseTest{
	@Test
	public void main() {
		Reporter.log("5.5");
	}
}