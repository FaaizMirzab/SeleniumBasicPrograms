package dropDownHandlings_SelectClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//sir used Example
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement country = driver.findElement(By.id("country"));
		Select select=new Select(country);
		//not available in my version . it available in new version(4.0.1)
		//System.out.println(select.getWrappedElement().getText());
	}
}