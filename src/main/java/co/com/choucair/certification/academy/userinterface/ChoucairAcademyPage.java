package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject {

    private static Target login_button;
    public static final Target LOGIN_BUTTON = login_button ;
}
