package org.cucmberbaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example {
	WebDriver driver;
	@Given("User have to launch the facebook application using chromebrowser")
	public void user_have_to_launch_the_facebook_application_using_chromebrowser() {
	   driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password() {
	   System.out.println("login thhink");
	   WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	   email.sendKeys("atchayak17@gmail.com");
	   WebElement password=driver.findElement(By.id("pass"));
	   password.sendKeys("kayira@07");
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
	 System.out.println("click login button");   
	 WebElement login=driver.findElement(By.name("login"));
	 login.click();
	}

	@Then("User have to reach the invalid credential page")
	public void user_have_to_reach_the_invalid_credential_page() {
		String url=driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("user Have to reach invalid credential page");
		} else {
			System.out.println("user have not reach invalid credential page");

		}
	 System.out.println("user move to invalid credential pagge");  
	}
}
