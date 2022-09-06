package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class PrintMessageInReport {
  @Test
  public void report() {
	  Reporter.log("welcome to selenium class");
  }
}