package com.volotea.qa.steps.Origin;

import com.volotea.qa.models.CityCode;
import com.volotea.qa.questions.CodeResult;
import com.volotea.qa.tasks.CityInputCode;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class SearchByCodeSteps {
    @When("^User writing the searching on the origin field$")
    public void userWritingTheSearchingOnOriginField(List<CityCode> data){
        OnStage.theActorInTheSpotlight().attemptsTo(CityInputCode.inputCityCode(data.get(0)));
    }

    @Then("^The origin field must do searching (.*)$")
    public void theOriginFieldMustDoSearching(String searchResult) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodeResult.codeResult(), org.hamcrest.Matchers.is(searchResult)));
    }
}
