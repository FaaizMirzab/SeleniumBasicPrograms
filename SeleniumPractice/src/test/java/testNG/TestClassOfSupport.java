package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassOfSupport extends Support{
  @Test(groups = "functionality1")
  public void login() {
	  Reporter.log("login successfully",true);
  }
  @Test(groups = "functionality2")
  public void logout() {
	  Reporter.log("logout sucessfully",true);
  }
}
