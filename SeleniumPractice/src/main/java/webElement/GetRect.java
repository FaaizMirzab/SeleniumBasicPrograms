package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  //  not optimized code
	  WebElement z = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	  Rectangle r = z.getRect();     // return type for getRect() is rectangle type of object
	  System.out.println(r);         // o/p - (org.openqa.selenium.Rectangle@8b400000)
	  int h=r.height;                // return type for height is int --- getHeight() can also use
	  System.out.println(h);         // o/p -(106)
	  int w = r.width;              // return type for width is int -----  getWidth() can also use
	  System.out.println(w);        // o/p -(301)
	  int axisX = r.x;              // return type for x is int ------  getX() can also use
	  System.out.println(axisX);      // o/p - (12)
	  int axisY = r.y;               // return type for y is int -------  getY() can also use
	  System.out.println(axisY);     //  o/p - (176)
	  driver.quit();    
      //
	             //or optimized code
	 
	  /*System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).getRect().height);// o/p -(106)
	  System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).getRect().width); // o/p -(301)
	  System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).getRect().x);   // o/p - (12)
	  System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).getRect().y);   //  o/p - (176)
	  driver.quit();*/       
	                                  // values may varies if we maximize the window
	}
}
