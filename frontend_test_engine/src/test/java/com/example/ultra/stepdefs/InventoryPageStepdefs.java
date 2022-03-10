package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.inventory.InventoryPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryPageStepdefs {
    @Autowired
    AtlasService atlasService;

    @Then("inventory page is opened")
    public void inventoryPageIsOpened() {
        getInventoryPage();
    }

    private InventoryPage getInventoryPage() {
        return atlasService.get(InventoryPage.class).isPageOpened();
    }
}
