package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="stepDefinitions.tagging",
		features="src/test/resources/features/tagging.feature",
		snippets=io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		monochrome=true,
		dryRun=false,
		//format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		tags= "@End2End"
		)

public class RunnerTagging {

}
