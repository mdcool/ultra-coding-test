package com.example.ultra.atlas;

import com.example.ultra.browser.BrowserService;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtlasService {
    @Autowired
    BrowserService browserService;
    // TODO: 09.03.2022 use @Value("$url")
    String url = "https://www.saucedemo.com/";

    public <T> T get(Class<T> clazz) {
        return new Atlas(new WebDriverConfiguration(browserService.getDriver(), url))
                .create(browserService.getDriver(), clazz);
    }
}
