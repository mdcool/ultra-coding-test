package com.example.ultra.stepdefs;

import com.example.ultra.actions.InventoryActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryStepdefs {
    @Autowired
    InventoryActions inventoryActions;

    @Then("inventory page is opened")
    public void inventoryPageIsOpened() {
        inventoryActions.inventoryPageIsOpened();
    }

    @And("user has a product in cart")
    public void userHasAProductInCart() {
        inventoryActions.inventoryPageIsOpened();
        inventoryActions.addAProductToCart();

    }
}
