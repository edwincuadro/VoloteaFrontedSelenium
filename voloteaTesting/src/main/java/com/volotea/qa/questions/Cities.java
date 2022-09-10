package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Origin.CITIES_QUANTITY;

public class Cities implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CITIES_QUANTITY), WebElementStateMatchers.isVisible()));
        return Text.of(CITIES_QUANTITY).viewedBy(actor).asString();
    }
    public static Cities cities(){
        return new Cities();
    }
}
