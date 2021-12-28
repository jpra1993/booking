package com.booking.certificacion.questions;

import com.booking.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class WelcomeMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(HomePage.LBL_WELCOME).viewedBy(actor).asBoolean();
    }

    public static WelcomeMessage OnHomePage() {
        return new WelcomeMessage();
    }
}
