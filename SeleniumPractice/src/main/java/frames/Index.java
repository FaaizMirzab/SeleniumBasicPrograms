package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("mirzuu");
		driver.findElement(By.name("password")).sendKeys("test123@");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(2000);
		//driver.quit();
	}

}
