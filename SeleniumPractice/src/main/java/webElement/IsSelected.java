package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep(3000);
	 WebElement x = driver.findElement(By.xpath("//input[@type='checkbox']"));
	System.out.println(x.isSelected());
	driver.quit();
	 
	}

}
                                  //used for check box