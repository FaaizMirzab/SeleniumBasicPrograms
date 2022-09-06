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

public class Support {
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
	  Reporter.log(" value entered",true);
  }
  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  Reporter.log(" after method",true);
  }
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  Reporter.log(" password element find",true);
  }
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  Reporter.log(" after class",true);
  }
  @BeforeTest(alwaysRun = true)
  public void beforeTest() {
	  Reporter.log(" value entered",true);
  }
  @AfterTest(alwaysRun = true)
  public void afterTest() {
	  Reporter.log(" after test",true);
  }
  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
	  Reporter.log(" username element find",true);
  }
  @AfterSuite(alwaysRun = true)
  public void afterSuite() {
	  Reporter.log(" after suit",true);
  }
}
