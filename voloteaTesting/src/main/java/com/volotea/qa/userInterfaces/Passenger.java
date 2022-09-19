package com.volotea.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Passenger {
    public static final Target PASSENGER_FIELD = Target
            .the("Validate passenger quantity").located(By.xpath("//span[@class='v7-passenger__number ng-star-inserted']"));

    public static final Target PLUS_ADULT = Target
            .the("Validate passenger quantity").located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));

    public static final Target PLUS_CHILD = Target
            .the("Validate passenger quantity").located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target PLUS_BABY = Target
            .the("Validate passenger quantity").located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[3]"));

    public static final Target GROUP_LINK = Target
            .the("Validate group reservation link").located(By.xpath("//span[@class='v7-rounded__text v7-rounded__text--xs']"));

}
