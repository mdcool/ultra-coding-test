package com.example.ultra.pageobjects.common;

import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.apache.commons.lang3.NotImplementedException;

public interface BasePage extends WebPage {

    @FindBy("//a[@class = 'shopping_cart_link']")
    BaseElement shoppingCartLink();

    default BasePage isPageOpened() {
        throw new NotImplementedException("This method must be implemented for concrete page");
    }
}
