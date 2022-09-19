package com.volotea.qa.tasks;

import com.volotea.qa.interactions.ScrollDown;
import com.volotea.qa.interactions.Wait;
import com.volotea.qa.models.PathTravel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.volotea.qa.userInterfaces.Date.*;
import static com.volotea.qa.userInterfaces.Destiny.DESTINY;
import static com.volotea.qa.userInterfaces.Destiny.DESTINY_FIELD;
import static com.volotea.qa.userInterfaces.Origin.ORIGIN_FIELD;
import static com.volotea.qa.userInterfaces.Origin.ORIGIN_INPUT;

public class FullReservation implements Task {
    private PathTravel pathTravel;
    public FullReservation(PathTravel pathTravel){
        this.pathTravel = pathTravel;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORIGIN_FIELD));
        actor.attemptsTo(Enter.theValue(pathTravel.getOrigin()).into(ORIGIN_INPUT));
        actor.attemptsTo(Click.on(DESTINY));
        actor.attemptsTo(Enter.theValue(pathTravel.getDestiny()).into(DESTINY_FIELD).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(DEPARTURE_DATE), Wait.waitTime(1));
        actor.attemptsTo(Click.on(CHOOSE_MONTH), Wait.waitTime(1));
        actor.attemptsTo(Click.on(MONTH_SELECT), Wait.waitTime(1));
        actor.attemptsTo(Click.on(DAY_GO), Wait.waitTime(1));
        //actor.attemptsTo(Click.on(SCROLL), ScrollDown.on(1));
        actor.attemptsTo(Click.on(CHOOSE_MONTH), Wait.waitTime(1));
        actor.attemptsTo(Click.on(MONTH_SELECT), Wait.waitTime(1));
        actor.attemptsTo(Click.on(DAY_BACK));
        actor.attemptsTo(Click.on(SEARCH_FLY));
    }
    public static FullReservation fullReservation(PathTravel pathTravel){
        return new FullReservation(pathTravel);
    }
}
