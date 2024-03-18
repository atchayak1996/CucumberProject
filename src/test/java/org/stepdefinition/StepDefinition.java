package org.stepdefinition;

import java.time.Duration;

import org.cucmberbaseclass.BaseClass;
import org.cucmberbaseclass.ForgottonPojo;
import org.cucmberbaseclass.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPojo l;
	ForgottonPojo f;
	@Given("User have to launch the facebook application using chromebrowser")
	public void user_have_to_launch_the_facebook_application_using_chromebrowser() {
	  browserLaunch();
	  launchUrl("https://www.facebook.com/");
	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password() {
	  l=new LoginPojo();
	  WebElement email=l.getEmail();
	  email.sendKeys("atchayak17");
	  WebElement password=l.getPassword();
	  password.sendKeys("kayira");
	  
	}
	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password() {
		 l=new LoginPojo();
		  WebElement email=l.getEmail();
		  email.sendKeys("amma");
		  WebElement password=l.getPassword();
		  password.sendKeys("kayira");
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		WebElement login=l.getLogin();
		login.click();
	}

	@Then("User have to reach the invalid credential page")
	public void user_have_to_reach_the_invalid_credential_page() {
		String url=driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("You have to reach invalid credential page");
		} else {
			System.out.println("You have not reach invalid credential page");

		}
	}
	

@When("User have to enter {string}  and {string}")
public void user_have_to_enter_and(String email, String pass) {
	 
		l=new LoginPojo();
	   l.getEmail().sendKeys(email);;
	   l.getPassword().sendKeys(pass);
}


@When("User have to click the forgotton password")
public void user_have_to_click_the_forgotton_password() {
   f=new ForgottonPojo();
   f.getForgottonPassword().click();
  
}

@When("User have to enter the email or mobile number")
public void user_have_to_enter_the_email_or_mobile_number() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  f.getEmailOrMobile().sendKeys("9877776788");
}

@Then("User have to click the search button")
public void user_have_to_click_the_search_button() {
	f.getSearch().click();
   
}




}
