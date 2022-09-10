package com.volotea.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userInterfaces.Passenger.PLUS_ADULT;

public class AdultPassenger implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PLUS_ADULT));
    }
    public static AdultPassenger adultPassenger(){
        return Tasks.instrumented(AdultPassenger.class);
    }
}
