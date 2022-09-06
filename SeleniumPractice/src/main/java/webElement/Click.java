package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	WebDriver driv=new ChromeDriver();
	driv.get("http://facebook.com");
	WebElement x = driv.findElement(By.xpath("//button[@value='1']"));
	x.click();
}
}
