package com.example.ultra.pageobjects.index;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface IndexPage extends BasePage {
    @FindBy("//input[@id = 'user-name']")
    BaseElement userNameInput();

    @FindBy("//input[@id = 'password']")
    BaseElement passwordInput();

    @FindBy("//input[@id = 'login-button']")
    BaseElement loginButton();

    @Override
    default IndexPage isPageOpened() {
        userNameInput().should(displayed());
        return this;
    }
}
