package com.example.ultra.pageobjects.checkout;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import com.example.ultra.pageobjects.common.components.CartItem;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface CheckoutStepTwo extends BasePage {
    @FindBy("//div[@class = 'cart_list']")
    BaseElement cartListContainer();

    @FindBy("//div[@class = 'cart_item']")
    ElementsCollection<CartItem> cartItems();

    @FindBy("//input[@id = 'finish']")
    BaseElement finishButton();

    @Override
    default BasePage isPageOpened() {
        cartListContainer().should(displayed());
        return this;
    }
}
