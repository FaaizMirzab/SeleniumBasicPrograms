package testNG_P1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class InPutFromXml {
	@Parameters({"url"})
	@Test
	public void main(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		if(url.equals("facebook")) {
		    
		     driver.get("https://www.facebook.com");
		}
		else {
			
			driver.get("https://www.youtube.com");
		}
	}
}
