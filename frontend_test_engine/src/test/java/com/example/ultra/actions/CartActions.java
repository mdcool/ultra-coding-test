package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.cart.CartPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartActions {
    @Autowired
    AtlasService atlasService;

    private CartPage getCartPage() {
        return atlasService.get(CartPage.class).isPageOpened();
    }
    public void goToCheckout() {
        getCartPage().checkoutButton().click();
    }
}
