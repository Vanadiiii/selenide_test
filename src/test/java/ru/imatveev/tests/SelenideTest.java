package ru.imatveev.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/hello.feature",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun-api.txt"
        }
)
class SelenideTest {
}
