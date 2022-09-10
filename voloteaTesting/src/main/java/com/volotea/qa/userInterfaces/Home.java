package com.volotea.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target ACCEPT_COOKIES = Target
            .the("Accept cookies").located(By.id("onetrust-accept-btn-handler"));
    public static final Target PASSENGER_BUTTON = Target
            .the("Click on passenger button").located(By.id("input-text_sf-passenger"));
}
