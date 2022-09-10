package com.volotea.qa.steps.Origin;

import com.volotea.qa.questions.Cities;
import com.volotea.qa.tasks.SelectOrigin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CitiesSteps {

    @When("^user clic on origin and Countries field$")
    public void userClicOnCountriesField() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.origin());
    }

    @Then("^Country's cities must be shown up (.*)$")
    public void countrySCitiesMustBeShownUp(String citiesQ) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Cities.cities(), org.hamcrest.Matchers.is(citiesQ)));
    }
}
