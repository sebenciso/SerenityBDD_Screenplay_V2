package co.com.choucair.certification.academy.tasks;

import net.serenitybdd.core.pages.PageObject;
import co.com.choucair.certification.academy.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    public static Performable thePage;
    private ChoucairAcademyPage choucairAcademyPage;
    private Object ChoucairAcademyPage;

    public OpenUp(Object choucairAcademyPage) {
        ChoucairAcademyPage = choucairAcademyPage;
    }

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn((PageObject) ChoucairAcademyPage));

    }

}
