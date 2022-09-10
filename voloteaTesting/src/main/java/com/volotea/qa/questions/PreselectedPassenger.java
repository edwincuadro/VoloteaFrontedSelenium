package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Passenger.PASSENGER_FIELD;

public class PreselectedPassenger implements Question <Integer>{
    @Override
    public Integer answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((PASSENGER_FIELD), WebElementStateMatchers.isVisible()));
        return Text.of(PASSENGER_FIELD).viewedBy(actor).asInteger();
    }

    public static PreselectedPassenger pPreselectedQuantity() {
        return new PreselectedPassenger();
    }
}
