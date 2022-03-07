package com.example.ultra.stepdefs;

import io.cucumber.java.en.Given;

public class MyStepdefs {

    @Given("sample test step")
    public void sampleTestStep() {
        System.out.println("Nothing should be done within this method");
    }
}
