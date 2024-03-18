package org.cucmberbaseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottonPojo extends BaseClass {
public ForgottonPojo() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forgottonPassword;

@FindBy(name="email")
private WebElement emailOrMobile;

@FindBy(name="did_submit")
private WebElement search;

public WebElement getForgottonPassword() {
	return forgottonPassword;
}


public WebElement getEmailOrMobile() {
	return emailOrMobile;
}


public WebElement getSearch() {
	return search;
}



}
