package co.com.nx.certificacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/googletranslate.feature",
		glue = {"co.com.nx.certificacion.stepdefinitions"},
		snippets = SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {

}
