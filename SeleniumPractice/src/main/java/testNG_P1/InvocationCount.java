package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 3)
	public void a() {
		Reporter.log(" hai ",true);
	}
   final int b = 3;
   @Test(invocationCount=b)
   public void b() {
	   Reporter.log(" hello ",true);
   }
}
