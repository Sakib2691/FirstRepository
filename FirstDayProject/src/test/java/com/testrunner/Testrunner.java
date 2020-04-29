package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Cucumber",
		glue="com.stepdef"
		
		
		)








public class Testrunner extends AbstractTestNGCucumberTests{

}


//@tags="@test one" thats for specific test feature