package com.booking.certificacion.stepdefinitions;

import com.booking.certificacion.exceptions.FailedQuestion;
import com.booking.certificacion.models.SearchCriteria;
import com.booking.certificacion.questions.SearchResultMessage;
import com.booking.certificacion.tasks.ChooseFilters;
import com.booking.certificacion.tasks.SearchAccommodation;
import com.booking.certificacion.utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SearchAccommodationStepDefinitions {

    @When("^enter the search criteria of the accommodation in Salento$")
    public void enterTheSearchCriteriaOfTheAccommodationInSalento(List<SearchCriteria> list) {
        SearchCriteria searchCriteria = list.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodation.On(searchCriteria));
    }

    @Then("^he will see the search results$")
    public void heWillSeeTheSearchResults() {
        OnStage.theActorInTheSpotlight().should(seeThat(SearchResultMessage.onSearchPage(),
                is(equalTo(true))).orComplainWith(FailedQuestion.class, Constants.MAXIMUM_CAPACITY));
    }

    @When("^select filter options$")
    public void selectFilterOptions() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseFilters.OnSearchResults());
    }

    @Then("^he will see specific search results$")
    public void heWillSeeSpecificSearchResults() {
        OnStage.theActorInTheSpotlight().should(seeThat(SearchResultMessage.onSearchPage(),
                is(equalTo(true))).orComplainWith(FailedQuestion.class, Constants.NO_CAPACITY));
    }
}
