package ru.imatveev.tests.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelenideConfig {
    @Bean
    @ConditionalOnProperty(prefix = "driver", name = "type", havingValue = "chrome")
    public WebDriver chromeDriver() {
//        WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(prefix = "driver", name = "type", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(prefix = "driver", name = "type", havingValue = "ie")
    public WebDriver ieDriver() {
        return new InternetExplorerDriver();
    }
}
