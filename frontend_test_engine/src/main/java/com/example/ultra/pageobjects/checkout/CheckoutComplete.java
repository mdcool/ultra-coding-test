package com.example.ultra.pageobjects.checkout;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface CheckoutComplete extends BasePage {
    @FindBy("//h2[@class = 'complete-header']")
    BaseElement completeHeader();

    @Override
    default BasePage isPageOpened() {
        completeHeader().should(displayed());
        return this;
    }
}
