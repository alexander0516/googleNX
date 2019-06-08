package co.com.nx.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Google apps button").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Google translate Option").located(By.id("gb51"));

}
