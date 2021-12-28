package com.booking.certificacion.tasks;

import com.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChooseFilters implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchPage.LIST_PRICE_FILTER),
                WaitUntil.the(SearchPage.LIST_DISTANCE_FILTER, WebElementStateMatchers.isVisible()),
                Click.on(SearchPage.LIST_DISTANCE_FILTER));
    }

    public static ChooseFilters OnSearchResults() {
        return Tasks.instrumented(ChooseFilters.class);
    }
}
