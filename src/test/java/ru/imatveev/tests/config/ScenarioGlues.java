package ru.imatveev.tests.config;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ScenarioGlues {
    @Autowired
    private WebDriver webDriver;

    @After
    public void closeWebDriver() {
        webDriver.close();
        webDriver.quit();
    }
}
