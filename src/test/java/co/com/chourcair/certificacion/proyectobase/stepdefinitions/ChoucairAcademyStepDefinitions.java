package co.com.chourcair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certification.academy.task.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;

public class ChoucairAcademyStepDefinitions {

    @Before
        public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

        @Given("^than brandon wants to learn automation at the academy Choucair$")
        public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair()  {
            // Write code here that turns the phrase above into concrete actions
            OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));        }

        @When("^he search for the course (.*) on the choucair academy plataform$")
        public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course)  {
            // Write code here that turns the phrase above into concrete actions
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

        }

        @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
        public void heSFindsCourseCalledResourcesRecursosAutomatizacionBancolombia() {
            // Write code here that turns the phrase above into concrete actions

        }
}

