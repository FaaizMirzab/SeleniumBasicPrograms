package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FBloginDrive {
	//declaration  using by - @FindBy 
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
	WebElement logo;
	
	WebDriver driver;
	
	//initialization using by - Constructor
	public FBloginDrive(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	//utilization using non static method
	public void setUserName() {
		username.sendKeys("9445620354");
	}
	public void setPassword() {
		password.sendKeys("FFmrz1532@");
	}
	public void login() {
		login.click();
	}
}
