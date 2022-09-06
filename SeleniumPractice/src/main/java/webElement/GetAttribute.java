package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement x = driver.findElement(By.xpath("//input[@type='text']"));
		x.sendKeys("iamfaaizmrz@gmail.com");
		System.out.println(x.getAttribute("value"));
		driver.quit();
	}

}
