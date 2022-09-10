package com.volotea.qa.tasks;

import com.volotea.qa.models.CityCode;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.volotea.qa.userInterfaces.Origin.ORIGIN_INPUT;

public class CityInputCode implements Task {
    private CityCode cityCode;
    public CityInputCode(CityCode cityCode){
        this.cityCode = cityCode;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(cityCode.getCityCode()).into(ORIGIN_INPUT).thenHit(Keys.ENTER));
    }

    public static CityInputCode inputCityCode(CityCode cityCode) {
        return new CityInputCode(cityCode);
    }
}
