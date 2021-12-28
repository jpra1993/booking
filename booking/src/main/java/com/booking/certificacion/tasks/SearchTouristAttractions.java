package com.booking.certificacion.tasks;

import com.booking.certificacion.userinterfaces.HomePage;
import com.booking.certificacion.userinterfaces.TouristAttractionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchTouristAttractions implements Task {
    private String place;

    public SearchTouristAttractions(String place) {
        this.place = place;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_TOURIST_ATTRACTIONS),
                Enter.theValue(place).into(TouristAttractionsPage.TXT_PLACE),
                Enter.keyValues(Keys.ARROW_DOWN).into(TouristAttractionsPage.TXT_PLACE),
                Enter.keyValues(Keys.ENTER).into(TouristAttractionsPage.TXT_PLACE),
                Click.on(TouristAttractionsPage.BTN_SEARCH),
                Click.on(TouristAttractionsPage.TOUR_OPTION));
    }

    public static SearchTouristAttractions On(String place) {
        return Tasks.instrumented(SearchTouristAttractions.class, place);
    }
}
