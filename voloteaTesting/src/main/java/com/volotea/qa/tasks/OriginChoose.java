package com.volotea.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userInterfaces.Origin.ORIGIN_FIELD;

public class OriginChoose implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORIGIN_FIELD));
    }
    public static OriginChoose originSelect(){
        return new OriginChoose();
    }
}
