package com.volotea.qa.steps.Passenger;

import com.volotea.qa.questions.GroupReservation;
import com.volotea.qa.tasks.AdultPassenger;
import com.volotea.qa.tasks.ChildPassenger;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class GroupReservationSteps {
    @When("^user input ten '(\\d+)' and '(\\d+)' passengers$")
    public void userInputTenAndPassengers(int adultQ, int childQ) {
        for (int i = 1; i < adultQ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(AdultPassenger.adultPassenger());
        }
        for (int i = 0; i < childQ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(ChildPassenger.childPassenger());
        }
    }

    @Then("^the group reservation link must be enabled (.*)$")
    public void theGroupReservationLinkMustBeEnabled(String link) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(GroupReservation.groupLink(), org.hamcrest.Matchers.is(link)));
    }
}
