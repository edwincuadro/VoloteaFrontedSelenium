package com.volotea.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userInterfaces.Home.ACCEPT_COOKIES;

public class AcceptCookies implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACCEPT_COOKIES));

    }
    public static AcceptCookies cookies(){
        return new AcceptCookies();
    }
}
