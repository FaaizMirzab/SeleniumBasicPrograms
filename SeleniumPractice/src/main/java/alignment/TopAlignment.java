package alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement element1 = driver.findElement(By.id("email"));
	WebElement element2 = driver.findElement(By.id("passContainer"));
	int value1 = (element1.getRect().getY())+(element1.getRect().getHeight());//if the give size of gap b/w to element add that also
	int value2 = element2.getRect().getY();
	if(value2>value1) {
		System.out.println("the elements are top aligned");
		System.out.println(value1);
		System.out.println(value2);
	}
	else {
		System.out.println("the elements are not top aligned");
	}
	driver.quit();
 }                  // o/p -(the elements are top aligned)
}
