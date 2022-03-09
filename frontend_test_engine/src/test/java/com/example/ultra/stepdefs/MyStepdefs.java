package com.example.ultra.stepdefs;

import com.example.ultra.browser.BrowserService;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdefs {
    @Autowired
    BrowserService browserService;
    // TODO: 09.03.2022 use @Value("$url")
    String url = "https://www.saucedemo.com/";

    @Given("sample test step")
    public void sampleTestStep() {
        System.out.println("Nothing should be done within this method");
    }

    @Given("open dummy page")
    public void openDummyPage() {
        browserService.getDriver().get(url);
    }
}
