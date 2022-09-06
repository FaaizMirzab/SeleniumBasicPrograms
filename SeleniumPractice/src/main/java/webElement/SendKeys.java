package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		WebElement y = driver.findElement(By.xpath("//input[@type='text']"));
		y.sendKeys("iamfaaizmrz@gmail.com");
		WebElement z = driver.findElement(By.xpath("//input[@type='password']"));
		z.sendKeys("FFmrz1532@");
		WebElement x = driver.findElement(By.xpath("//button[@value='1']"));
		x.click();
	}
}
