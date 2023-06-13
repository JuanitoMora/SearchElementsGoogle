package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="stepDefinitions.google",
		features="src/test/resources/features/google.feature",
		snippets=io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		monochrome=true,
		dryRun=true
		)

public class RunnerGoogle {

}
