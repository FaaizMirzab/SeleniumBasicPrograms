package SearchContext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		      // by using locators we find the element.
		driver.findElement(By.xpath("//img[@class='lnXdpd']"));// by xpath
		driver.findElement(By.className("lnXdpd"));//by className
		//etc.....
		
	}

}