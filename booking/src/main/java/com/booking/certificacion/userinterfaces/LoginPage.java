package com.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_EMAIL =
            Target.the("EMAIL TXT")
                    .located(By.id("username"));

    public static final Target BTN_CONTINUE =
            Target.the("CONTINUE BTN")
                    .locatedBy("(//span[@class='_1jp30RWusTBQoML9GSCZ_C'])[2]");

    public static final Target TXT_PASSWORD =
            Target.the("PASSWORD TXT")
                    .located(By.id("password"));

    public static final Target BTN_LOGIN =
            Target.the("LOGIN BUTTON")
                    .locatedBy("//button[@class='_2emQHDWTNbBMVHK80Tj0A2 _2V1p8Jqj0mC6lhwPQD7Wm2 _3idbYJ1oAGD-sl-6gdCR2e _1Oxra6oXUcB9EXOfxAD2i2 _2b3nVYidxpTD-0_hVml1lP _2__0gVPBP36LBlyHwThlOQ']");

    public static final Target ERROR_MESSAGE =
            Target.the("ERROR MESSAGE")
                    .located(By.id("password-note"));
}
