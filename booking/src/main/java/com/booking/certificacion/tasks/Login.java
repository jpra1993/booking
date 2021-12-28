package com.booking.certificacion.tasks;

import com.booking.certificacion.models.Credentials;
import com.booking.certificacion.userinterfaces.HomePage;
import com.booking.certificacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(credentials.getEmail()).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_CONTINUE),
                Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));
    }

    public static Login with(Credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }
}
