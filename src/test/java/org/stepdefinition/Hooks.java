package org.stepdefinition;

import java.util.Date;

import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HookPojo {
@Before(order=1)
public void tc1() {
	browserLaunch();
	launchUrl("https://www.facebook.com/");

}
@Before(order=2)
public void tc2() {
	HookPojo l=new HookPojo();
	l.getEmail().sendKeys("sst");
	l.getPassword().sendKeys("kayira");
	l.getLogin().click();

}
@After(order=2)
public void tc3() {
	Date d=new Date();
	int date = d.getDate();
	System.out.println(date);
}
public void tc4() {
	closeBrowser();
}
}
