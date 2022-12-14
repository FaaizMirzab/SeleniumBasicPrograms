package dropDownHandlings_SelectClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DeselectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//sir used Example
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement beverage = driver.findElement(By.id("beverages"));
		Select select=new Select(beverage);
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByValue("1");
		Thread.sleep(3000);
		select.deselectByValue("3");
		Thread.sleep(3000);
		select.deselectByValue("1");
	}
}