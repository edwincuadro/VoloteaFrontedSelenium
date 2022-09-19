package com.volotea.qa.tasks;

import com.volotea.qa.models.CityData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.volotea.qa.userInterfaces.Origin.ORIGIN_FIELD;
import static com.volotea.qa.userInterfaces.Origin.ORIGIN_INPUT;

public class CityInput implements Task {

    private CityData cityData;
    public CityInput(CityData cityData){
        this.cityData = cityData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORIGIN_FIELD));
        actor.attemptsTo(Enter.theValue(cityData.getCityName()).into(ORIGIN_INPUT).thenHit(Keys.ENTER));
    }
    public static CityInput inputCity(CityData cityData){
        return new CityInput(cityData);
    }
}
