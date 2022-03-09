package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.IndexPage;
import com.example.ultra.pageobjects.SwagLabsSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexPageStepdefs {
    @Autowired
    AtlasService atlasService;

    @Given("index page is open")
    public void indexPageIsOpen() {
        atlasService.get(SwagLabsSite.class).index().open();
        // TODO: 09.03.2022 add assertion that page was opened
    }

    @And("credentials are entered")
    public void credentialsAreEntered() {
        IndexPage indexPage = atlasService.get(IndexPage.class);
        indexPage.userNameInput().sendKeys("standard_user");
        indexPage.passwordInput().sendKeys("secret_sauce");
    }

    @When("login button is pressed")
    public void loginButtonIsPressed() {
        IndexPage indexPage = atlasService.get(IndexPage.class);
        indexPage.loginButton().click();
    }
}
