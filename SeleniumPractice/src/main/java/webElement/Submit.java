package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://www.facebook.com");
    WebElement x = driver.findElement(By.name("login"));
    x.submit();
    Thread.sleep(3000);
   
    driver.get("https://demo.actitime.com/login.do");
    Thread.sleep(5000);
    WebElement y = driver.findElement(By.xpath("//div[text()='Login ']"));
    y.submit();
    //Thread.sleep(3000);
    driver.quit();
}
}
