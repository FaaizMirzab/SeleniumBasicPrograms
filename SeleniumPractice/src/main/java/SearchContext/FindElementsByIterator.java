package SearchContext;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByIterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//div"));
		System.out.println(allLinks.size());
		ListIterator<WebElement> il = allLinks.listIterator();
		while(il.hasNext()) {
			System.out.println(il.next().getText());
		}
		driver.quit();
	}

}
