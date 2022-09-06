package alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.id("email"));
		WebElement element2 = driver.findElement(By.id("passContainer"));
		int value1 = element1.getRect().getX();
		int value2 = element2.getRect().getX();
		if(value1==value2) {
			System.out.println("the elements are left alignmented");
		}
		else {
			System.out.println("the elements are not left alignmented");
		}
		driver.quit();
	}
            // o/p -(the elements are left alignmented)
}
