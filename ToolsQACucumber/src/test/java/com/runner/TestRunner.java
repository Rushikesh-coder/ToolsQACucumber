package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/feature files",
		glue = {"com.StepDefination"},
		dryRun = false,
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
