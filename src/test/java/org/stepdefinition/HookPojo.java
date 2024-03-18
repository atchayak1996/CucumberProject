package org.stepdefinition;

import org.cucmberbaseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HookPojo extends BaseClass {
	public HookPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
