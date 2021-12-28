package com.booking.certificacion.questions;

import com.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class SearchResultMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(SearchPage.LBL_SEARCH).viewedBy(actor).asBoolean();
    }

    public static SearchResultMessage onSearchPage() {
        return new SearchResultMessage();
    }
}
