package com.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {

    public static final Target LBL_SEARCH =
            Target.the("SEARCH LABEL")
                    .locatedBy("//h1[@class='_30227359d _0db903e42']");

    public static final Target LIST_PRICE_FILTER =
            Target.the("PRICE FILTER LIST")
                    .locatedBy("(//div[@class = '_dc55ee131 _2c4e87539'])[5]");

    public static final Target LIST_DISTANCE_FILTER =
            Target.the("DISTANCE FILTER LIST")
                    .locatedBy("(//div[@class = '_dc55ee131 _2c4e87539'])[12]");
}
