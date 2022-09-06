

package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBloginDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		FBloginDrive d=new FBloginDrive(driver);
		d.setUserName();
		d.setPassword();
		Thread.sleep(3000);
		driver.navigate().refresh();
		d.setUserName();
		d.setPassword();
		Thread.sleep(3000);
		d.login();
		Thread.sleep(10000);
		driver.quit();
	}

}
