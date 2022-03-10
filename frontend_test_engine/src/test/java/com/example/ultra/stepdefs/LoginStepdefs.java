package com.example.ultra.stepdefs;

import com.example.ultra.actions.IndexActions;
import com.example.ultra.actions.InventoryActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginStepdefs {
    @Autowired
    IndexActions indexActions;
    @Autowired
    InventoryActions inventoryActions;

    @And("credentials are entered")
    public void credentialsAreEntered() {
        indexActions.enterCredentials();
    }

    @When("login button is pressed")
    public void loginButtonIsPressed() {
        indexActions.pressLoginButton();
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        indexActions.enterCredentials();
        indexActions.pressLoginButton();
        inventoryActions.inventoryPageIsOpened();
    }
}
