package com.example.ultra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties()
@SpringBootApplication(scanBasePackages = {"com.example.ultra"})
@EntityScan(basePackages = {"com.example.ultra"})
public class Application {
}
