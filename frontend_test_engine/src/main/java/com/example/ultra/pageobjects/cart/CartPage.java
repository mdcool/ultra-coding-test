package com.example.ultra.pageobjects.cart;

import com.example.ultra.pageobjects.common.components.CartItem;
import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface CartPage extends BasePage {

    @FindBy("//div[@id = 'cart_contents_container']")
    BaseElement cartContainer();

    @FindBy("//div[@class = 'cart_item']")
    ElementsCollection<CartItem> cartItems();

    @FindBy("//button[@id = 'checkout']")
    BaseElement checkoutButton();

    @Override
    default CartPage isPageOpened() {
        cartContainer().should(displayed());
        return this;
    }
}
