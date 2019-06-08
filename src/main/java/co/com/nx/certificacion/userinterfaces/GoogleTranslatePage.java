package co.com.nx.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Google apps button").located(By.id("source"));
	public static final Target TARGET_TEXT_AREA_RESULT = Target.the("Source language").locatedBy("//div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]/span");

// /html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]	
}
