package com.jagan;

import com.jagan.base.BaseTest;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {
				"json:target/cucumber.json","html:target/site/cucumber-pretty"
		},
		features = {"src/test/resources/feature"},
		glue = {"com.jagan.Steps"},
		tags = "@fb"
)

public class TestRunner extends BaseTest {
}