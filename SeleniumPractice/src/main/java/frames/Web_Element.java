package frames;

	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Web_Element {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/downloads/");
			driver.findElement(By.xpath("(//a[text()='API Docs'])[3]")).click();
			driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.xpath("//a[contains(text(),'chromium')]")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.className("interfaceName")).click();
			driver.switchTo().defaultContent();
			driver.quit();
		}
	}
