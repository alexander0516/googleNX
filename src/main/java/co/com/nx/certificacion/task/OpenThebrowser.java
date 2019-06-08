package co.com.nx.certificacion.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.nx.certificacion.userinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThebrowser implements Task {
	
	private PageObject page;
	
	public OpenThebrowser(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenThebrowser on(GoogleHomePage url) {
		
       return instrumented(OpenThebrowser.class,url);
	}

}
