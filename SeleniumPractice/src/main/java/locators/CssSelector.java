package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    //AND
	    //WebElement x = driver.findElement(By.cssSelector("input[type='text'][data-testid='royal_email']"));
	    WebElement x = driver.findElement(By.cssSelector("[type='text'][data-testid='royal_email']"));
	    //OR
	    //WebElement x = driver.findElement(By.cssSelector("input[type='text'],[data-testid='royal_email']"));
	    //WebElement x = driver.findElement(By.cssSelector("[type='text'],[data-testid='royal_email']"));
	    x.sendKeys("itsMirzab");
	    Thread.sleep(3000);
	    driver.quit(); // for cssSelector we have to use two attributes and its value
	}
}
