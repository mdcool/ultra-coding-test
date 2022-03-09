package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.IndexPage;
import com.example.ultra.pageobjects.SwagLabsSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class CatalogPageStepdefs {
    @Autowired
    AtlasService atlasService;

    @Then("catalog page is opened")
    public void catalogPageIsOpened() {
        // TODO: 09.03.2022 implement
    }
}
