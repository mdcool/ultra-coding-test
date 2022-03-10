package com.example.ultra.pageobjects.checkout;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface CheckoutStepOne extends BasePage {
    @FindBy("//input[@id = 'first-name']")
    BaseElement firstNameInput();

    @FindBy("//input[@id = 'last-name']")
    BaseElement lastNameInput();

    @FindBy("//input[@id = 'postal-code']")
    BaseElement zipCodeInput();

    @FindBy("//input[@id = 'continue']")
    BaseElement continueButton();

    @Override
    default BasePage isPageOpened() {
        firstNameInput().should(displayed());
        return this;
    }
}
