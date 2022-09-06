package alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment {
           public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			WebElement element1 = driver.findElement(By.id("email"));
			WebElement element2 = driver.findElement(By.id("passContainer"));
			int value1 =(element1.getRect().getX())+(element1.getRect().getWidth());
			int value2 =(element2.getRect().getX())+(element2.getRect().getWidth());
			if(value1==value2) {
				System.out.println("the elements are right alignmented");
			}
			else {
				System.out.println("the elements are not right alignmented");
			}
			driver.quit();	
		}  // o/p -(the elements are right alignmented)
}
