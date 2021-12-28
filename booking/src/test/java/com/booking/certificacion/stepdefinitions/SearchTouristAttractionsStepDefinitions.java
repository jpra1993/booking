package com.booking.certificacion.stepdefinitions;

import com.booking.certificacion.exceptions.FailedQuestion;
import com.booking.certificacion.questions.ResultTouristAttractions;
import com.booking.certificacion.tasks.SearchTouristAttractions;
import com.booking.certificacion.utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SearchTouristAttractionsStepDefinitions {

    @When("^enter the search criteria of the tourist attractions on (.*)$")
    public void enterTheSearchCriteriaOfTheTouristAttractionsOn(String place) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTouristAttractions.On(place));
    }

    @Then("^he will see the search tourist attractions results$")
    public void heWillSeeTheSearchTouristAttractionsResults() {
        OnStage.theActorInTheSpotlight().should(seeThat(ResultTouristAttractions.onSearch(),
                is(equalTo("true"))).orComplainWith(FailedQuestion.class, Constants.TOUR_NOT_FOUND));
    }
}
