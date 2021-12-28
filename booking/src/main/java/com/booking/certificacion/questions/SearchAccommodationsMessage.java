package com.booking.certificacion.questions;

import com.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SearchAccommodationsMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return SearchPage.LBL_SEARCH.resolveFor(actor).getText();
    }

    public static SearchAccommodationsMessage onSearchPage() {
        return new SearchAccommodationsMessage();
    }
}
