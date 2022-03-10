package com.example.ultra.pageobjects.common;

import io.qameta.atlas.webdriver.WebPage;
import org.apache.commons.lang3.NotImplementedException;

public interface BasePage extends WebPage {

    default BasePage isPageOpened() {
        throw new NotImplementedException("This method must be implemented for concrete page");
    }
}
