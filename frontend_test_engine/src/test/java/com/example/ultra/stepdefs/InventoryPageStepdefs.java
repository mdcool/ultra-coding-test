package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryPageStepdefs {
    @Autowired
    AtlasService atlasService;

    @Then("inventory page is opened")
    public void inventoryPageIsOpened() {
        // TODO: 09.03.2022 implement
    }
}
