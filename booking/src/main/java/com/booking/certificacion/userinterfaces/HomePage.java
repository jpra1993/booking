package com.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_LOGIN =
            Target.the("LOGIN BUTTON")
                    .locatedBy("(//a[@class='bui-button bui-button--secondary js-header-login-link'])[2]");

    public static final Target LBL_WELCOME =
            Target.the("WELCOME LABEL")
                    .locatedBy("//span[@class='sb-searchbox__title-text']");

    public static final Target TXT_DESTINATION =
            Target.the("DESTINATION TXT")
                    .located(By.id("ss"));

    public static final Target FL_CHECKIN =
            Target.the("CHECK IN FIELD")
                    .locatedBy("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");

    public static final Target CHECKIN_DATE =
            Target.the("CHECKIN DATE")
                    .locatedBy("//*[@data-date='{0}']");

    public static final Target CHECKOUT_DATE =
            Target.the("CHECKOUT DATE")
                    .locatedBy("//*[@data-date='{0}']");

    public static final Target PERSONS =
            Target.the("PERSONS")
                    .locatedBy("//*[@class='xp__guests__count']");

    public static final Target BTN_QUANTITY_PERSONS =
            Target.the("QUANTITY PERSONS BUTTON")
                    .locatedBy("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[1]");

    public static final Target BTN_SEARCH =
            Target.the("SEARCH BUTTON")
                    .locatedBy("//button[@class='sb-searchbox__button ']");

    public static final Target BTN_TOURIST_ATTRACTIONS =
            Target.the("TOURIST ATTRACTIONS BUTTON")
                    .locatedBy("(//*[@class= 'bui-tab__link'])[3]");
}
