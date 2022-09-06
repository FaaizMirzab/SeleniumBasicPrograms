package testNG;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class Group {	
  @Test(groups = "Smoke")
  public void beforeMethod() {
	  Reporter.log("befor method  smoke",true);
  }
  @Test(groups = {"reg","Smoke"})
  public void afterMethod() {
	  Reporter.log("after method smoke & reg",true);
  }
  @Test(groups =" reg")
  public void beforeClass() {
	  Reporter.log("befor class  reg",true);
  }
  @Test(groups = " integration")
  public void afterClass() {
	  Reporter.log("after class integration",true);
  }
  @Test(groups = "reg")
  public void beforeTest() {
	  Reporter.log("befor test reg",true);
  }
  @Test(groups = "smoke")
  public void afterTest() {
	  Reporter.log("after test smoke",true);
  }
  @Test(groups = "integration")
  public void beforeSuite() {
	  Reporter.log("before suit integration",true);
  }
  @Test(groups = "reg")
  public void afterSuite() {
	  Reporter.log("after suit reg",true);
  }
}
