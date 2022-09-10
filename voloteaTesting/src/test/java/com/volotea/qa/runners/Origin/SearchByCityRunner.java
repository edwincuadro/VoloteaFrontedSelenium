package com.volotea.qa.runners.Origin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Origin/seachByCity.feature",
        glue = "com.volotea.qa.steps", snippets = SnippetType.CAMELCASE)
public class SearchByCityRunner {
}
