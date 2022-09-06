package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("mirzuu");
		driver.findElement(By.name("password")).sendKeys("test123@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@onclick='expandPanel(this);']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftpanel");
		WebElement x = driver.findElement(By.xpath("//span[@class='header']"));
		System.out.println(x.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
