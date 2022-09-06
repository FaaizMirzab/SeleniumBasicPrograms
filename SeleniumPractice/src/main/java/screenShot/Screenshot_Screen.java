package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Screen {
      public static void main(String[] args) throws IOException {
      Date date=new Date();
      
      String todate = date.toString().replace(":",",");
	
      
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  
	  driver.get("http://www.instagram.com");
	  
	  
	    File target=new File("./screenshot/"+todate+" instashot.png");
	    
	    
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  
	  
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    
	  FileHandler.copy(source,target);
	  driver.quit();
	  
	  
	  //or
	 /* public static void main(String[] args) throws IOException {
      Date date=new Date();
      String todate=date.toString().replace(":",",");
	 
      
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.instagram.com");
	  File target=new File("./screenshot/"+todate+" instashot.png");
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File("./screenshot/"+todate+" instashot.png"));
	  driver.quit();
	  
	 */
	  
  }
}
