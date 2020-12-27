package ru.imatveev.tests.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.imatveev.tests.config.EnvConfig;

@Component
public class GooglePage {
    @Autowired
    private WebDriver webDriver;
    @Autowired
    private EnvConfig envConfig;

    @FindBy(name = "q")
    private SelenideElement searchBar;
    @FindBy(name = "btnK")
    private SelenideElement findButton;
    @FindBy(name = "btnI")
    private SelenideElement luckyButton;

    public void open() {
        webDriver.get(envConfig.getUrl());
    }

    public void search(String expression) {
        searchBar.setValue(expression);
        findButton.click();
    }
}
