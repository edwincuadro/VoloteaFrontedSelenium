package com.volotea.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userInterfaces.Home.PASSENGER_BUTTON;

public class SelectPassenger implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PASSENGER_BUTTON));
    }
    public static SelectPassenger clickPassenger(){
        return new SelectPassenger();
    }
}
