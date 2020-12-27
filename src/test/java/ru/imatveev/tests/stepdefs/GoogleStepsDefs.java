package ru.imatveev.tests.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import ru.imatveev.tests.config.CucumberSpringConfiguration;
import ru.imatveev.tests.config.EnvConfig;
import ru.imatveev.tests.page.GooglePage;

@Slf4j
@CucumberContextConfiguration
public class GoogleStepsDefs extends CucumberSpringConfiguration {
    @Autowired
    private EnvConfig envConfig;
    @Autowired
    private GooglePage googlePage;

    @Then("say {word}")
    public void saySomeWord(String expression) {
        log.info(expression);
        log.info(envConfig.getUrl());
    }

    @When("open Google page")
    public void openGooglePage() {
        googlePage.open();
    }

    @And("search {string}")
    public void search(String expression) {
        googlePage.search(expression);
    }
}
