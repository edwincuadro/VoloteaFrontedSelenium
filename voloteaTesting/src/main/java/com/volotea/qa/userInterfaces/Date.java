package com.volotea.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Date {
    public static final Target DEPARTURE_DATE = Target.
            the("Go date").locatedBy("//label[@for='sf-departure']");

    public static final Target CHOOSE_MONTH = Target.
            the("Go date").locatedBy("//div [@class='v7-input-text v7-input-text--light || v7-calendar__select || v7-u-ib']");

    public static final Target MONTH_SELECT = Target.
            the("Month").locatedBy("(//li[@class='v7-input-select__item ng-star-inserted'])[4]");

    public static final Target DAY_GO = Target.
            the("Month").locatedBy("//sf-calendar-month[@id='vol-month-11']//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']");

    public static final Target SCROLL = Target.
            the("Go date").locatedBy("//span[@class='v7-flex v7-flex--block v7-flex--abottom || v7-calendar__header-tool']");

    public static final Target DAY_BACK = Target.
            the("Month").locatedBy("//sf-calendar-month[@id='vol-month-11']//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']");

    public static final Target CONFIRMATION_FLY = Target.
            the("Confirm fly").locatedBy("//div[@class='row']//div[@class='v7-header__inner']//*[@class='v7-header__content-inner']//*[@class='v7-header__title || v7-flex']");

    public static final Target SEARCH_FLY = Target.
            the("Month").locatedBy("//app-main-button[@id='search-btn']//a[@class='v7-btn v7-sf__btn || v7-btn--md v7-btn--block']");
}
