package com.example.ultra.stepdefs;

import com.example.ultra.actions.IndexActions;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicStepdefs {
    @Autowired
    IndexActions indexActions;

    @Given("website is open")
    public void websiteIsOpen() {
        indexActions.websiteIsOpen();
    }
}
