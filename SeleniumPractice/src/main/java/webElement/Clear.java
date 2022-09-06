package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	WebElement y = driver.findElement(By.xpath("//input[@type='text']"));
	y.sendKeys("iamfaaizmrz@gmail.com");
	WebElement z = driver.findElement(By.xpath("//input[@type='password']"));
	z.sendKeys("FFmrz1532@");
	Thread.sleep(5000);
	y.clear();
	z.clear();
	y.sendKeys("9445620354");
	z.sendKeys("00000000");
 }
}
