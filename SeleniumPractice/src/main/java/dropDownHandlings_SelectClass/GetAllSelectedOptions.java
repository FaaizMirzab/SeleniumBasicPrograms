package dropDownHandlings_SelectClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GetAllSelectedOptions{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//sir used example
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement country = driver.findElement(By.id("country"));
		Select select=new Select(country);
		Thread.sleep(3000);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		List<WebElement> all_Selected_Options = select.getAllSelectedOptions();
		for(WebElement option: all_Selected_Options) {
			System.out.println(option.getText());
		}
	}
}