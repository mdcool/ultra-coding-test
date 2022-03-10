package com.example.ultra;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty", "html:build/cucumber/pretty"},
        glue = {"com.example.ultra"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}