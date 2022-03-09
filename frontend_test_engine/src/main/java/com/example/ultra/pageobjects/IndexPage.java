package com.example.ultra.pageobjects;

import com.example.ultra.pageobjects.common.BaseElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface IndexPage extends WebPage {
    @FindBy("//input[@id = 'user-name']")
    BaseElement userNameInput();

    @FindBy("//input[@id = 'password']")
    BaseElement passwordInput();

    @FindBy("//input[@id = 'login-button']")
    BaseElement loginButton();
}
