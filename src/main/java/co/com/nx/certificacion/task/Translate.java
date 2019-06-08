package co.com.nx.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.nx.certificacion.userinterfaces.GoogleTranslatePage;

public class Translate implements Task{

	private String wordinenglish;
	
	public Translate(String wordinenglish) {
		this.wordinenglish = wordinenglish;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(wordinenglish).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA));
	}

	public static Translate the(String wordinenglish) {
		// TODO Auto-generated method stub
		return instrumented(Translate.class,wordinenglish);
	}

}
