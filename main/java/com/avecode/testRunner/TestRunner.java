package com.avecode.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/shahzadkahlon/Desktop/AveCode/src/main/java/com/avecode/feature/SignIn.feature"
		,glue={"/Users/shahzadkahlon/Desktop/AveCode/src/main/java/com/avecode/stepdefinition"},
		format= {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		strict = true,
		monochrome = true,
		dryRun = true
		
		)

public class TestRunner {

}

