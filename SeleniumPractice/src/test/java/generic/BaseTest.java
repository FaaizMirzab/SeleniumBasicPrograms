package generic;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest implements IConstant{
      public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(wt,TimeUnit.SECONDS);//wt from interface inherited
	  driver.get(url);//url from interface inherited
  }
 
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
