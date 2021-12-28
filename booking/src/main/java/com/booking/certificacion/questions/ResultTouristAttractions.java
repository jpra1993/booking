package com.booking.certificacion.questions;

import com.booking.certificacion.userinterfaces.TouristAttractionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ResultTouristAttractions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(TouristAttractionsPage.SEARCH_RESULT).viewedBy(actor).asBoolean();
    }

    public static ResultTouristAttractions onSearch() {
        return new ResultTouristAttractions();
    }
}
