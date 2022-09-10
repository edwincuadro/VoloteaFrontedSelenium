package com.volotea.qa.steps.Passenger;

import com.volotea.qa.tasks.SelectPassenger;
import com.volotea.qa.questions.PreselectedPassenger;
import com.volotea.qa.tasks.AcceptCookies;
import com.volotea.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OnePassengerSteps {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUp(){
        myBrowser.manage().window().maximize(); //Maximizar ventana
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Volotea user");
    }
    @Given("^user on the site$")
    public void userSelectThePassengerField() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browserGetUp());
        OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.cookies());
    }

    @When("^user click on passenger field$")
    public void showUpTheForm() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectPassenger.clickPassenger());
    }

    @Then("^adult passenger field must be (.*)$")
    public void adultPassengerFieldMustBe(Integer PreselectedQuantity) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreselectedPassenger.pPreselectedQuantity(), org.hamcrest.Matchers.is(PreselectedQuantity)));
    }
}
