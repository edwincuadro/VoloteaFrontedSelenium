package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Passenger.GROUP_LINK;

public class GroupReservation implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((GROUP_LINK), WebElementStateMatchers.isVisible()));
        return Text.of(GROUP_LINK).viewedBy(actor).asString();
    }
    public static GroupReservation groupLink(){
        return new GroupReservation();
    }
}
