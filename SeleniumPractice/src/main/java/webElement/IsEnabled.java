package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		System.out.println(x.isEnabled());
		//boolean text = x.isEnabled();
		//System.out.println(text);
		driver.quit();
	}

}
