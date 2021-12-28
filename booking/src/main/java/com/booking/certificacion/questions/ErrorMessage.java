package com.booking.certificacion.questions;

import com.booking.certificacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ErrorMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.ERROR_MESSAGE).viewedBy(actor).asBoolean();
    }

    public static ErrorMessage OnLoginPage() {
        return new ErrorMessage();
    }
}
