package webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();      // important
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement x = driver.findElement(By.xpath("//div[@id='passContainer']"));
		Dimension s = x.getSize();       //  return type for getSize() is dimension
		System.out.println(s);
		driver.quit();               // o/p without maximize (364, 52)
		                             // o/p  with maximize   (364, 52)   sometime we get same value
	}

}
