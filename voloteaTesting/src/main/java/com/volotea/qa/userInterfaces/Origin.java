package com.volotea.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {
    public static final Target ORIGIN_FIELD = Target
            .the("Origin field").located(By.xpath("//*[@class='v7-sf__group-item v7-sf__group-item--origin v7-is-filled']"));
    public static final Target COUNTRY_BUTTON = Target
            .the("Country button").located(By.xpath("//button[@class='v7-selector__link || v7-js-route-selector capitalize']"));

    public static final Target CITIES_QUANTITY = Target
            .the("Cities Quantity").located(By.xpath("(//*[@class='v7-route__info-city || v7-small-text v7-small-text--lg || v7-u-color-dark-40'])[1]"));

    public static final Target ORIGIN_INPUT = Target
            .the("Input city").located(By.xpath("//input[@id='origin']"));

    public static final Target RESULT_CITY = Target
            .the("Validate results").located(By.xpath("(//*[@class='v7-route__info-from'])[1]"));

    public static final Target CODE_RESULT = Target
            .the("Input city").located(By.xpath("//h3[@class='v7-card__title || v7-sub-title v7-sub-title--md || v7-u-bold']"));


}
