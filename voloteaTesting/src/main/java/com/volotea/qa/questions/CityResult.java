package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Origin.RESULT_CITY;

public class CityResult implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((RESULT_CITY), WebElementStateMatchers.isVisible()));
        return Text.of(RESULT_CITY).viewedBy(actor).asString();
    }
    public static CityResult cityResult(){
        return new CityResult();
    }
}
