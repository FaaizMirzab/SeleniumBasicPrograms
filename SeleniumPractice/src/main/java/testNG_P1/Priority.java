package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	/* int b=4;
	@Test(priority=b)
	public void h() {
		Reporter.log(" hello ");
	}*/  // this will give error because variable not accepted in priority
	
	final int a=4; // but final prefixed variable will accept
	@Test(priority=1)
	public void a() {
		Reporter.log("hai",true);
	}
	@Test(priority = 2)
	public void z() {
		Reporter.log(" this ", true);
	}
	@Test(priority=3)
	public void d() {
		Reporter.log(" is ",true);
	}
	@Test(priority=a)
	public void e() {
		Reporter.log(" mirzab ",true);
	}
	@Test(priority=a)
	public void f() {
		Reporter.log(" . ", true);
	}
}
