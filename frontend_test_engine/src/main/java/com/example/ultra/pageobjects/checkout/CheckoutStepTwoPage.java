package com.example.ultra.pageobjects.checkout;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import com.example.ultra.pageobjects.common.components.CartItem;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface CheckoutStepTwoPage extends BasePage {
    @FindBy("//div[@class = 'cart_list']")
    BaseElement cartListContainer();

    @FindBy("//div[@class = 'cart_item']")
    ElementsCollection<CartItem> cartItems();

    @FindBy("//button[@id = 'finish']")
    BaseElement finishButton();

    @Override
    default CheckoutStepTwoPage isPageOpened() {
        cartListContainer().should(displayed());
        return this;
    }
}
