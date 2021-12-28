package com.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TouristAttractionsPage {

    public static final Target TXT_PLACE =
            Target.the("PLACE TXT")
                    .locatedBy("//input[@placeholder = 'Destinos, museos, tours...']");

    public static final Target BTN_SEARCH =
            Target.the("PLACE BUTTON")
                    .locatedBy("//button[@class= 'Actionable-module__root___3GRl0 Button-module__root___1g71n Button-module__root--variant-primary___2a3l5 Button-module__root--size-large___2ajBg Button-module__root--variant-primary-action___3vxYJ css-1s7ghdq']");

    public static final Target TOUR_OPTION =
            Target.the("TOUR OPTION")
                    .locatedBy("//span[contains(text(), 'Tours')]");

    public static final Target SEARCH_RESULT =
            Target.the("SEARCH RESULT")
                    .locatedBy("(//*[contains(text(), '128  de 161 resultados')])[1]");
}
