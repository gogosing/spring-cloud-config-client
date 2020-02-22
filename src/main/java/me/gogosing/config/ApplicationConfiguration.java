package me.gogosing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JinBum Jeong on 2020/02/22.
 */
@Configuration
@ConfigurationProperties(prefix = "application")
public class ApplicationConfiguration {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
