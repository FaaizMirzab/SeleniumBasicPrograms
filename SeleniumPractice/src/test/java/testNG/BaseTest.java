package testNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class BaseTest {

  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("4",true);
  }
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("6",true);
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("3",true);
  }
  @AfterClass
  public void afterClass() {
	  Reporter.log("7",true);
  }
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("2",true);
  }
  @AfterTest
  public void afterTest() {
	  Reporter.log("8",true);
  }
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("1",true);
  }
  @AfterSuite
  public void afterSuite() {
	  Reporter.log("9",true);
  }
}
