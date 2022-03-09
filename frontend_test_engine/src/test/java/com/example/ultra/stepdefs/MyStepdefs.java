package com.example.ultra.stepdefs;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.SwagLabsSite;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdefs {
    @Autowired
    AtlasService atlasService;

    @Given("sample test step")
    public void sampleTestStep() {
        System.out.println("Nothing should be done within this method");
    }

    @Given("open atlas dummy page")
    public void openAtlasDummyPage() {
        SwagLabsSite swagLabsSite = atlasService.get(SwagLabsSite.class);
        swagLabsSite.index().open();
    }
}
