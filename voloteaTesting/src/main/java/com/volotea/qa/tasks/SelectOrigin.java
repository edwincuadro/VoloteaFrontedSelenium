package com.volotea.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userInterfaces.Origin.*;

public class SelectOrigin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORIGIN_FIELD));
        actor.attemptsTo(Click.on(COUNTRY_BUTTON));
    }
    public static SelectOrigin origin(){
        return new SelectOrigin();
    }
}
