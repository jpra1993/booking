package com.booking.certificacion.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static com.booking.certificacion.utils.ManualTests.validate;

public class ManualStepDefinitions {
    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTestBooking(String step) {
        validate(step, scenario.getName());
    }
}