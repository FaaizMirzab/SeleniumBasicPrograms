package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_element {
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		String todate=date.toString().replace(":","-");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		WebElement x = driver.findElement(By.xpath("//div[@class='UYrFC _80tAB']"));
		File target=new File("./screenshot/"+todate+"Insta img element 2.png");
		TakesScreenshot ts=(TakesScreenshot) x;
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, target);
		driver.close();
	}
}