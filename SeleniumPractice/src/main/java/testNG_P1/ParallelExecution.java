package testNG_P1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParallelExecution {
	@Parameters({"url"})
	@Test
	public void main(String url) {
		WebDriver driver;
		if(url.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		driver.get("https://www.facebook.com");
	}
}