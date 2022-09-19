package com.volotea.qa.steps.FullReservation;

import com.volotea.qa.models.CityData;
import com.volotea.qa.models.PathTravel;
import com.volotea.qa.questions.ConfirmationFly;
import com.volotea.qa.tasks.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class FullReservationSteps {
    @When("^user select '(\\d+)' '(\\d+)' '(\\d+)'$")
    public void userSelect(int adultQ, int childQ, int babyQ) {
        for (int i = 1; i < adultQ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(AdultPassenger.adultPassenger());
        }
        for (int i = 0; i < childQ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(ChildPassenger.childPassenger());
        }
        for (int i = 0; i < babyQ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(BabyPassenger.babyPassenger());

        }

    }
    @When("^user select$")
    public void userSelect(List<PathTravel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullReservation.fullReservation(data.get(0)));
    }


    @Then("^user see the confirmation (.*)$")
    public void userSeeTheConfirmation(String confirmation) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmationFly.confirmationFly(), org.hamcrest.Matchers.is(confirmation)));
    }
}
