package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();   // important
	driver.get("http://www.facebook.com");
	Thread.sleep(3000);
	WebElement x = driver.findElement(By.id("email"));
	Point l = x.getLocation();                           //return type for getLOcation() is Point
	System.out.println(l);
	driver.quit();                             // o/p  without maximize -(597, 148)
	                                           // o/p  with maximize  -  (780, 148)
 }
}
