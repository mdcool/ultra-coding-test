package com.example.ultra.configuration;

import com.example.ultra.browser.BrowserService;
import io.cucumber.java.After;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration
@SpringBootTest
public class Hooks {
    @Autowired
    BrowserService browserService;

    @After
    public void closeBrowser() {
        System.out.println("closing browser");
        browserService.closeBrowser();
    }
}
