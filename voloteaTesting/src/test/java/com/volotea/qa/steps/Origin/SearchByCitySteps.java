package com.volotea.qa.steps.Origin;


import com.volotea.qa.models.CityData;
import com.volotea.qa.questions.CityResult;
import com.volotea.qa.tasks.CityInput;
import com.volotea.qa.tasks.OriginChoose;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class SearchByCitySteps {
    @Given("^user select the origin field$")
    public void userSelectTheOriginField() {
        OnStage.theActorInTheSpotlight().attemptsTo(OriginChoose.originSelect());
    }

    @When("^User writing the searching on origin field$")
    public void userWritingTheSearchingOnOriginField(List<CityData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(CityInput.inputCity(data.get(0)));
    }

    @Then("^The origin field must does searching (.*)$")
    public void theOriginFieldMustDoesSearching(String SearchResults) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CityResult.cityResult(), org.hamcrest.Matchers.is(SearchResults)));
    }
}
