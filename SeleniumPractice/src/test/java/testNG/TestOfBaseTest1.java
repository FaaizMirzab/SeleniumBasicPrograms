package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestOfBaseTest1 extends BaseTest{
	@Test
	public void main() {
		Reporter.log("5",true);		
	}
}