package co.com.chourcair.certificacion.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features ="src/test/resources/features/academyChourcair.feature",
        tags = "@Regression",
        glue = "co.com.chourcair.certification.proyectobase.co.com.chourcair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}
