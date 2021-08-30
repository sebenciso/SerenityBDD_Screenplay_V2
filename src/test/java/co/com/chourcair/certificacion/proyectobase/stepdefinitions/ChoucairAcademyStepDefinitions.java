package co.com.chourcair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.task.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
        public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

        @Given("^than brandon wants to learn automation at the academy Choucair$")
        public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception  {
            // Write code here that turns the phrase above into concrete actions
            OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));        }
                    ChoucairAcademyStepDefinitions(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword());
        @When("^he search for the course (.*) on the choucair academy plataform$")
        public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
        throws Exception
        {
            // Write code here that turns the phrase above into concrete actions
            OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));

        }

        @Then("^he finds the course called resources (.*)$")
        public void heSFindsCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception  {
            // Write code here that turns the phrase above into concrete actions
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
        }
}
