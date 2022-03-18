package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				plugin="pretty",
				features="src/test/resources/BUISINESS_LOGIC/CUCUMBER_SUITES",
				tags="@SmokeTest",
				glue="cucumbermap",
				monochrome=true
					
		
		
		)

public class Test
{

}
