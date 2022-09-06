package webDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Manage {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.manage().window().minimize(); only in new version v-4.3.0
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		Dimension d=new Dimension(600,600);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		driver.quit();
	}
}
