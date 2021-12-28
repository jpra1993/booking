package com.booking.certificacion.stepdefinitions;

import com.booking.certificacion.exceptions.FailedQuestion;
import com.booking.certificacion.models.Credentials;
import com.booking.certificacion.questions.ErrorMessage;
import com.booking.certificacion.questions.WelcomeMessage;
import com.booking.certificacion.tasks.Login;
import com.booking.certificacion.utils.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinitions {

    @Given("^is in the home page$")
    public void isInTheHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }

    @When("^enter credentials$")
    public void enterCredentials(List<Credentials> list) {
        Credentials credentials = list.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(credentials));
    }

    @Then("^he will see the profile correctly$")
    public void heWillSeeTheProfileCorrectly() {
        OnStage.theActorInTheSpotlight().should(seeThat(WelcomeMessage.OnHomePage(),
                is(equalTo(true))).orComplainWith(FailedQuestion.class, Constants.INCORRECT_CREDENTIALS));
    }

    @When("^enter wrong password$")
    public void enterWrongPassword(List<Credentials> list) {
        Credentials credentials = list.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(credentials));
    }

    @Then("^he will see the error message$")
    public void heWillSeeTheErrorMessage() {
        OnStage.theActorInTheSpotlight().should(seeThat(ErrorMessage.OnLoginPage(),
                is(equalTo(true))).orComplainWith(FailedQuestion.class, Constants.MESSAGE_NOT_DISPLAYED));
    }
}
