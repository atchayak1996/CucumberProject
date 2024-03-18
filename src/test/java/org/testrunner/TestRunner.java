package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Kayira\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Featurefolder",
glue="org.stepdefinition",monochrome=true,dryRun=false)
public class TestRunner {

}
 
