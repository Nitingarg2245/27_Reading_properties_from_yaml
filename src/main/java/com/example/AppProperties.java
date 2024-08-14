package com.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

//to yr is class ke variable map mai sari key value pairs store ho jayenge
@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private  Map<String,String> messages=new HashMap<>();
}
