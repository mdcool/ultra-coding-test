package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.SwagLabsSite;
import com.example.ultra.pageobjects.index.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexPageStepdefs {
    @Autowired
    AtlasService atlasService;

    @Given("index page is open")
    public void indexPageIsOpen() {
        IndexPage indexPage = atlasService.get(SwagLabsSite.class).index();
        indexPage.open();
        indexPage.isPageOpened();
    }

    private IndexPage getIndexPage() {
        return atlasService.get(IndexPage.class).isPageOpened();
    }

    @And("credentials are entered")
    public void credentialsAreEntered() {
        IndexPage indexPage = getIndexPage();
        indexPage.userNameInput().sendKeys("standard_user");
        indexPage.passwordInput().sendKeys("secret_sauce");
    }

    @When("login button is pressed")
    public void loginButtonIsPressed() {
        IndexPage indexPage = getIndexPage();
        indexPage.loginButton().click();
    }
}
