package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Prajwal\\Desktop\\Prajwal\\Selenium Class\\Daily Batch 267\\day1");
	}
}