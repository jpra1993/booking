package com.booking.certificacion.tasks;

import com.booking.certificacion.models.SearchCriteria;
import com.booking.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchAccommodation implements Task {
    private SearchCriteria searchCriteria;

    public SearchAccommodation(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchCriteria.getDestination()).into(HomePage.TXT_DESTINATION),
                Click.on(HomePage.FL_CHECKIN),
                Click.on(HomePage.CHECKIN_DATE.of(searchCriteria.getCheckin())),
                Click.on(HomePage.CHECKOUT_DATE.of(searchCriteria.getCheckout())),
                Click.on(HomePage.PERSONS),
                Click.on(HomePage.BTN_QUANTITY_PERSONS),
                Click.on(HomePage.BTN_SEARCH)
        );
    }

    public static SearchAccommodation On(SearchCriteria searchCriteria) {
        return Tasks.instrumented(SearchAccommodation.class, searchCriteria);
    }
}
