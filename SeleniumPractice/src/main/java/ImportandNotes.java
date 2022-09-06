import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
         // for study purpose in this version this option is not available it only available in latest version
public class ImportandNotes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*
		driver.switchTo().newWindow(WindowType.TAB);
		// it is used to open new tab 
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		// it is used to open new window
		*/
	}

}
