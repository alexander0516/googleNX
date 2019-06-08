package co.com.nx.certificacion.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.nx.certificacion.task.GoTo;
import co.com.nx.certificacion.task.OpenThebrowser;
import co.com.nx.certificacion.task.Translate;
import co.com.nx.certificacion.userinterfaces.GoogleAppsComponents;
import co.com.nx.certificacion.userinterfaces.GoogleHomePage;
import co.com.nx.certificacion.userinterfaces.GoogleTranslatePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("susan");
	private GoogleHomePage googleHomepage;
	
	@Before
	public void setUp(){
		susan.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.wasAbleTo(OpenThebrowser.on(googleHomepage));
		susan.wasAbleTo(GoTo.theApp(GoogleAppsComponents.GOOGLE_TRANSLATE));
	}


	@When("^she translates the word  (.*) from English to Spanish$")
	public void sheTranslatesTheWordFromEnglishToSpanish(String wordinenglish) throws Exception {
	  susan.wasAbleTo(Translate.the(wordinenglish));
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordInTheScreen(String wordinspanish) throws Exception {
		susan.should(seeThat(the(GoogleTranslatePage.TARGET_TEXT_AREA_RESULT),containsText(wordinspanish)));
	}

}
