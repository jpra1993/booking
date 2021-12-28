package com.booking.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/change_language.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.booking.certificacion.stepdefinitions",
        dryRun = false)

public class ChangeLanguage {
}
