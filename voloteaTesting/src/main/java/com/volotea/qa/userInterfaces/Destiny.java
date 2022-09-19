package com.volotea.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Destiny {
    public static final Target DESTINY_FIELD = Target.
            the("Choose destiny").located(By.xpath("//input[@id='destination']"));

    public static final Target DESTINY = Target.
            the("Choose destiny").locatedBy("//div[@data-input='origin']//div[@class='v7-sf__group-item v7-sf__group-item--destination']//div[@class='v7-sf__fieldset']");
}
