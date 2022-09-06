package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		WebElement x = driver.findElement(By.xpath("//a[@class='gb_d']"));
		System.out.println(x.getText());
		driver.quit();
	}

}
