package com.example.ultra.stepdefs;

import com.example.ultra.browser.BrowserService;
import com.example.ultra.pageobjects.SwagLabsSite;
import io.cucumber.java.en.Given;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
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

    @Given("open atlas dummy page")
    public void openAtlasDummyPage() {
        WebDriver driver = browserService.getDriver();
        SwagLabsSite swagLabsSite = new Atlas(new WebDriverConfiguration(driver, url))
                .create(driver, SwagLabsSite.class);
        swagLabsSite.index().open();
    }
}
