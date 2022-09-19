package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Date.CONFIRMATION_FLY;

public class ConfirmationFly implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CONFIRMATION_FLY), WebElementStateMatchers.isVisible()));
        return Text.of(CONFIRMATION_FLY).viewedBy(actor).asString();
    }
    public static ConfirmationFly confirmationFly(){
        return new ConfirmationFly();
    }
}
