package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_5_fF")
	private WebElement loginBtn;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement setUserName() {
		return username;
	}
	public WebElement setPassword() {
		return password;
	}
	public WebElement LoginBtn() {
		return 	loginBtn;
	}
	

}
