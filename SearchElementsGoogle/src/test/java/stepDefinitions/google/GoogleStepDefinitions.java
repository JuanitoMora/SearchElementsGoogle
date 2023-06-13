package stepDefinitions.google;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Google;

public class GoogleStepDefinitions {

	Google page_Google = new Google();

	@Given("I launch Chrome browser")
	public void iLaunchChromeBrowser() {
		page_Google.launchBrowser();
	}

	@When("I open Google Homepage")
	public void iOpenGoogleHomepage(){
		page_Google.openGoogleURL();
	}

	@Then("I verify that the page displays search text box")
	public void iVerifyThatThePageDisplaysSearchTextBox() {
		page_Google.SearchBox();
	}

	@Then("The page displays Google Search button")
	public void thePageDisplaysGoogleSearchButton() throws InterruptedException {
		page_Google.SearchButton();
	}

	@Then("The page displays Im Feeling Lucky button")
	public void thePageDisplaysImFeelingLuckyButton() throws InterruptedException {
		page_Google.LuckyButton();
	}

	@Then("The browser close")
	public void theBrowserClose() {
		page_Google.closeBrowser();
	}
}
