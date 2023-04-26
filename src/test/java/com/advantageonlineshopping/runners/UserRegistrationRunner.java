package com.advantageonlineshopping.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userRegistration.feature",
        glue = "com.advantageonlineshopping.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class UserRegistrationRunner {

}
