package org.cucmberbaseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email1;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getEmail() {
		return email1;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

}
