package ru.imatveev.tests.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "env")
@PropertySource(value = "classpath:application.yaml", encoding = "UTF-8")
public class EnvConfig {
    private String url;
}
