package javaScriptOnSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.youtube.com");
		Thread.sleep(3000); // due to network lag i used thread
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<10000;i++) {
		js.executeScript("window.scrollBy(0,10)");
		}
	}  //if we want to scroll slowly from top to bottom we have to use scrollBy

}
